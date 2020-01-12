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
        LocalDate firstMonday = LocalDate.now();
        while(!date.getDayOfWeek().equals(DayOfWeek.MONDAY)){
            date = date.plusDays(1);
            //System.out.println(date.getDayOfWeek());
        }
        LocalDate last_day_of_month = date.with(lastDayOfMonth());
        firstMonday=date;

        while(firstMonday.isBefore(last_day_of_month)){
            System.out.println(firstMonday);
            firstMonday = firstMonday.plusDays(7);
        }


    }
}

   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();
        int month = scanner.nextInt();

        LocalDate date = firstWeekdayInMonth(DayOfWeek.MONDAY, year, month);
        LocalDate next = date;

        while (next.getMonth() == date.getMonth()) {
            System.out.println(next);
            next = next.plusWeeks(1);
        }
    }

    public static LocalDate firstWeekdayInMonth(DayOfWeek day, int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        int offset = (day.getValue() + 7 - date.getDayOfWeek().getValue()) % 7;
        return date.plusDays(offset);
    }
}*/