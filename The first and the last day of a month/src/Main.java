import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        LocalDate date = LocalDate.now().withYear(year).withMonth(month);
        LocalDate first = date.withDayOfMonth(1);
        LocalDate last = date.withDayOfMonth(date.lengthOfMonth());
        System.out.print(first);
        System.out.print(" ");
        System.out.print(last);

        //final LocalDate date = LocalDate.of(scanner.nextInt(), scanner.nextInt(), 1);
        //System.out.println(date + " " + date.plusMonths(1).minusDays(1));


    }
}