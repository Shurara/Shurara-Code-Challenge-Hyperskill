import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fromIncl = scanner.nextInt();
        int toIncl = scanner.nextInt();
        int firstDivisor = scanner.nextInt();
        int secondDivisor = scanner.nextInt();

        long reduce = LongStream.rangeClosed(fromIncl, toIncl)
                .filter(n -> (n % firstDivisor == 0 ||
                        n % secondDivisor == 0))
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
    }
}