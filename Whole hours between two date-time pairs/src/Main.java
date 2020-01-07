import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime firstDate= LocalDateTime.parse(scanner.nextLine());
        LocalDateTime secondDate= LocalDateTime.parse(scanner.nextLine());
        long hours = ChronoUnit.HOURS.between(firstDate, secondDate);
        System.out.println(hours);
    }
   /* public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String dateTimeString1 = sc.next();
        final LocalDateTime dateTime1 = LocalDateTime.parse(dateTimeString1);

        final String dateTimeString2 = sc.next();
        final LocalDateTime dateTime2 = LocalDateTime.parse(dateTimeString2);

        final long secondsBetweenDates = Math.abs(dateTime2.toEpochSecond(ZoneOffset.UTC) - dateTime1.toEpochSecond(ZoneOffset.UTC));
        final long hoursBetweenDates = secondsBetweenDates / 3600;

        System.out.println(hoursBetweenDates);
    }*/
}