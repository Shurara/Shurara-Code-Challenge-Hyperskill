import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static <T> List<T> createReversedListByIterator(ListIterator<T> iterator) {
        List<T> list = new ArrayList<>();


       while (iterator.hasNext()){
           list.add(iterator.next());
       }
        int counter = 0;
       while(iterator.hasPrevious()){
           T temp = iterator.previous();
           list.set(counter, temp);
           counter++;
       }

        return list;
    }

    /* Do not change the code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        createReversedListByIterator(list.listIterator())
                .forEach(e -> System.out.print(e + " "));
    }
}