import java.time.LocalDate;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        IntStream.generate(scanner::nextInt)
                .limit(3)
                .mapToObj(x -> LocalDate.ofYearDay(year, x))
                .forEach(System.out::println);
    }
}