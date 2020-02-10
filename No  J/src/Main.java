import java.util.*;

public class Main {

    public static void processIterator(String[] array) {
        List<String> list = new LinkedList<>(Arrays.asList(array));;
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.charAt(0) == 'J') {
                iterator.set(item.substring(1));
            } else {
                iterator.remove();
            }

        }
        //iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        processIterator(scanner.nextLine().split(" "));
    }
}