import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        final int numberOfSwap = scanner.nextInt();
        for (int i = 0; i < numberOfSwap; i++) {
            Collections.swap(list, scanner.nextInt(), scanner.nextInt());
        }
        list.stream().forEach(x -> System.out.print(x + " "));
    }
}