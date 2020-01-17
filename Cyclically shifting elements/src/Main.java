import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = IntStream.generate(scanner::nextInt)
                .limit(n)
                .boxed()
                .collect(Collectors.toList());
        Collections.rotate(numbers, 1);
        numbers.stream()
                .forEach(x -> System.out.print(x + " "));

    }
}