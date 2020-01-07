import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalTime localTime = LocalTime.parse(scanner.nextLine());
        System.out.println(localTime.minusSeconds(localTime.getSecond()));
    }
}

    /*public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);

        final String timeString = sc.next();
        final LocalTime time = LocalTime.parse(timeString).withSecond(0);

        System.out.println(time.toString());
    }*/