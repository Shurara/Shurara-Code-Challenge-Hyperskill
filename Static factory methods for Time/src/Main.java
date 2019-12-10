// Posted from EduTools plugin
import java.util.Scanner;

class Time {

    int hour;
    int minute;
    int second;

    public static Time noon() {
        Time noonTime = new Time();
        noonTime.hour = 12;
        noonTime.minute = 0;
        noonTime.second = 0;
        return noonTime;
    }

    public static Time midnight() {
        Time midnightTime = new Time();
        midnightTime.hour = 0;
        midnightTime.minute = 0;
        midnightTime.second = 0;
        return midnightTime;
    }

    public static Time ofSeconds(long seconds) {
        Time timeOfSec = new Time();
        timeOfSec.hour = (int) (seconds/3600%24);
        timeOfSec.minute = (int) ((seconds%3600)/60);
        timeOfSec.second = (int) (seconds%60);
        return timeOfSec;
    }

    public static Time of(int hour, int minute, int second) {
        Time ofTime = new Time();
        if(hour >=0 && hour <= 23) {
            ofTime.hour = hour;
        }else{
            return null;
        }
        if(minute >=0 && minute <= 59) {
            ofTime.minute = minute;
        }else{
            return null;
        }
        if(second >=0 && second <= 59) {
            ofTime.second = second;
        }else{
            return null;
        }
        return ofTime;
    }
}

/* Do not change code below */
public class Main {

    public static void main(String args[]) {
        final Scanner scanner = new Scanner(System.in);

        final String type = scanner.next();
        Time time = null;

        switch (type) {
            case "noon":
                time = Time.noon();
                break;
            case "midnight":
                time = Time.midnight();
                break;
            case "hms":
                int h = scanner.nextInt();
                int m = scanner.nextInt();
                int s = scanner.nextInt();
                time = Time.of(h, m, s);
                break;
            case "seconds":
                time = Time.ofSeconds(scanner.nextInt());
                break;
            default:
                time = null;
                break;
        }

        if (time != null) {
            System.out.println(String.format("%s %s %s", time.hour, time.minute, time.second));
        } else {
            System.out.println(time);
        }
    }
}
