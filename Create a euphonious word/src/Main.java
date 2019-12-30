import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String CONSONANTS = "bcdfghjklmnpqrstvwxz";
        String VOWELS = "aeiouy";
        int count = 0;


        for (int i = 1; i < input.length()-1; i++) {
            if (VOWELS.indexOf(input.charAt(i)) != -1
                    && VOWELS.indexOf(input.charAt(i - 1)) != -1
                    && VOWELS.indexOf(input.charAt(i + 1)) != -1
                    || CONSONANTS.indexOf(input.charAt(i)) != -1
                    && CONSONANTS.indexOf(input.charAt(i - 1)) != -1
                    && CONSONANTS.indexOf(input.charAt(i + 1)) != -1) {
            count++;
            i+=1;
            }
        }
        System.out.println(count);
    }
}