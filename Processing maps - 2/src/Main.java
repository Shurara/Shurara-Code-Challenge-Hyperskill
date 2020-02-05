import java.util.*;
import java.util.stream.Collectors;

class MapUtils {

    public static NavigableMap<Integer, String> getSubMap(NavigableMap<Integer, String> map) {
        NavigableMap<Integer, String> resultMap = new TreeMap<>();
        if (map.firstKey() % 2 != 0) {
            resultMap = map.entrySet().stream()
                    .limit(map.firstKey() + 4)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, TreeMap::new));

        } else {
            resultMap = map.tailMap(map.lastKey() - 4, true).entrySet().stream()
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, TreeMap::new));
        }
        return resultMap.descendingMap();
    }

}

/* Do not modify code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<Integer, String> map = new TreeMap<>();
        Arrays.stream(scanner.nextLine().split("\\s")).forEach(s -> {
            String[] pair = s.split(":");
            map.put(Integer.parseInt(pair[0]), pair[1]);
        });
        NavigableMap<Integer, String> res = MapUtils.getSubMap(map);
        res.forEach((k, v) -> System.out.println(k + " : " + v));
    }
}