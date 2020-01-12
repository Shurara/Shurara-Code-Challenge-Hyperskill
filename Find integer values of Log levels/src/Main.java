import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<String> list = Arrays.asList(scanner.nextLine().split(" "));
        long sum = list.stream().mapToInt(x -> Level.parse(x.toUpperCase()).intValue()).sum();
        System.out.println(sum);
    }
}