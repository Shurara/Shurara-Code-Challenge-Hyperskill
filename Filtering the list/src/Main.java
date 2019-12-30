import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> list = IntStream.range(0, numbers.size())
                .filter(index -> index % 2 != 0)
                .mapToObj(i -> numbers.get(i))
                .collect(Collectors.toList());
        Collections.reverse(list);
        list.stream().forEach(x -> System.out.print(x + " "));
    }
}