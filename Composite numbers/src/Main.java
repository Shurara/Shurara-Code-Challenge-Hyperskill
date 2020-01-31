import java.util.Scanner;
import java.util.stream.LongStream;

public class Main {

    public static boolean isComposite(long number) {
       return LongStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}