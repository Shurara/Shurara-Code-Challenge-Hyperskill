import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    static void changeList(List<String> list){
        String longest = list.stream().max(Comparator.comparingInt(String::length)).get();
        IntStream.range(0, list.size())
                .mapToObj(x -> list.set(x, longest))
                .collect(Collectors.toList());

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}