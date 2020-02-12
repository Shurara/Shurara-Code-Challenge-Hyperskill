import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       long seconds = scanner.nextInt();
        System.out.println(LocalTime.ofSecondOfDay(seconds));
    }
}