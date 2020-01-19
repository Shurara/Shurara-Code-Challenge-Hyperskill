import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minTimeOfSleep = scanner.nextInt();
        int maxTimeOfSleep = scanner.nextInt();
        int realTimeOfSleep = scanner.nextInt();
        System.out.println(realTimeOfSleep < minTimeOfSleep
                ?"Deficiency"
                : realTimeOfSleep<=maxTimeOfSleep
                ?"Normal":"Excess");


    }
}