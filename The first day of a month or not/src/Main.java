import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.ofYearDay(scanner.nextInt(), scanner.nextInt());
        System.out.println(localDate.getDayOfMonth() == 1);
    }
}