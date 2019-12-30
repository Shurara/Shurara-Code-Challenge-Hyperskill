import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOne = getList(scanner);
        List<Integer> listTwo = getList(scanner);
        System.out.print(Collections.indexOfSubList(listOne, listTwo));
        System.out.print(" ");
        System.out.print(Collections.lastIndexOfSubList(listOne, listTwo));

    }


    private static List<Integer> getList(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
    }

}