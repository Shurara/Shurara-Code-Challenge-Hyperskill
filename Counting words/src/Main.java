import java.util.*;

class MapUtils {

    public static SortedMap<String, Integer> wordCount(String[] strings) {
        SortedMap sortedMap = new TreeMap<>();
        for (int i = 0; i < strings.length; i++) {

            sortedMap.put(strings[i], Collections.frequency(Arrays.asList(strings), strings[i]));
        }

        return sortedMap;

    }

    public static void printMap(Map<String, Integer> map) {
        map.entrySet()
                .stream()
                .forEach(x -> System.out.println(x.getKey() + " : " + x.getValue()));
    }

}

/* Do not change code below */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        MapUtils.printMap(MapUtils.wordCount(words));
    }
}