import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        boolean res = n > -15 && n <= 12 || n > 14 && n < 17 || n >= 19;
        System.out.println(res ? "True" : "False");
    }
}