import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime localDateTime = LocalDateTime.parse(scanner.nextLine());
        LocalDateTime result = localDateTime.plusMinutes(scanner.nextInt());
        int year = result.getYear();
        int day = result.getDayOfYear();
        LocalTime localTime = result.toLocalTime();
        System.out.printf("%d %d " + localTime, year, day);

    }
}