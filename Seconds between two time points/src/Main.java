import java.time.LocalTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime firstTime = LocalTime.parse(scanner.nextLine());
        LocalTime secondTime = LocalTime.parse(scanner.nextLine());
        System.out.println(Math.abs(ChronoUnit.SECONDS.between(firstTime, secondTime)));
    }
}