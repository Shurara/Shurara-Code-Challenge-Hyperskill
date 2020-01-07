import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        LocalDate date = LocalDate.now().withYear(year).withMonth(month).withDayOfMonth(1);
        //System.out.println(date.getDayOfWeek());
        while(!date.getDayOfWeek().equals(DayOfWeek.MONDAY)){
            date = date.plusDays(1);
            //System.out.println(date.getDayOfWeek());
        }

        while(date.isBefore(date.withMonth(month).with(lastDayOfMonth()))){
            System.out.println(date);
            date = date.plusDays(7);
        }


    }
}