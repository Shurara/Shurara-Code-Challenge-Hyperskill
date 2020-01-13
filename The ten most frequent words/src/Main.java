import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> allWords = List.of(new Scanner(System.in).nextLine().split("\\W+"));
        Map<String, Long> mapOfWords = allWords.stream()
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        Map<String, Long> result = mapOfWords.entrySet().stream()
                .sorted(Collections.reverseOrder(Comparator.comparing(Map.Entry<String, Long>::getValue))
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        result.entrySet().stream()
                .map(e -> e.getKey())
                .limit(10)
                .forEach(System.out::println);


    }

}

/*
import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.Arrays;
        import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        new BufferedReader(new InputStreamReader(System.in))
                .lines()
                .flatMap(line -> Arrays.stream(line.split("[\\p{Punct}\\s]+")))
                .collect(Collectors.toMap(w -> w.toLowerCase(), w -> 1, Integer::sum))
                .entrySet()
                .stream()
                .sorted((x, y) -> y.getValue() == x.getValue()
                        ? x.getKey().compareTo(y.getKey())
                        : (y.getValue() - x.getValue()))
                .limit(10)
                .forEach(x -> System.out.println(x.getKey()));
    }
}*/
