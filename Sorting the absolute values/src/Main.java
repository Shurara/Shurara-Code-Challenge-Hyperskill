import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       Arrays.stream(scanner.nextLine().split("\\s+"))
               .mapToInt(Integer::parseInt)
               .map(Math::abs)
               .sorted()
               .forEach(x -> System.out.print(x+ " "));
    }
}