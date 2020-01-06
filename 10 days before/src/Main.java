import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse(new Scanner(System.in).nextLine().trim());
        System.out.println(date.minusDays(10));
    }
}