import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static int findMaxByIterator(Iterator<Integer> iterator) {
        int maximumElement = Integer.MIN_VALUE;
        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (temp > maximumElement) {
                maximumElement = temp;
            }

        }
        return maximumElement;
    }


    /* Do not change code below */
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        final List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(findMaxByIterator(list.iterator()));
    }
}