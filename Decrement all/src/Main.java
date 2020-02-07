import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntStream.generate(scanner::nextInt)
                .limit(4)
                .map(x -> x - 1)
                .forEach(x -> System.out.print(x + " "));

    }
}