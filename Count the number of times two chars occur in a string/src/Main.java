import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char one = scanner.next().charAt(0);
        char two = scanner.next().charAt(0);
        String target = new StringBuilder().append(one).append(two).toString();
        int count = 0;
        for(int i = 0; i < input.length()-1; i++){
            if(input.substring(i, i+2).equals(target)){
                count++;

            }
        }
        System.out.println(count);
    }
}