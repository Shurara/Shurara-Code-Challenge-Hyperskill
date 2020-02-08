import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int[] ints = IntStream.generate(scanner::nextInt)
                .limit(limit)
                .toArray();
        int target = scanner.nextInt();
        System.out.println(Arrays.stream(ints)
                .anyMatch(x -> x == target));

    }
}