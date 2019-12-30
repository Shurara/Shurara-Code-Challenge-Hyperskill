import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        System.out.println(++number%2 == 0? number: ++number);
    }
}