
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//upper
        int b = sc.nextInt();//lower
        int c = sc.nextInt();//digits
        int n = sc.nextInt();//



        Set<Character> set = new HashSet<>();
        for (int i = 0; i < a; i++) {
            set.add(Character.toUpperCase(createRandomSybmbol()));
        }
        for (int i = 0; i < b; i++) {
            set.add(Character.toLowerCase(createRandomSybmbol()));
        }
        for (int i = 0; i < c; i++) {
            set.add(Character.forDigit(new Random().nextInt(10) , 10));

        }



        StringBuilder builder= new StringBuilder();
        n < a+b+c ? n = a+b+c: n =n;
        for(int i = 0; i < n; i++){
            builder.append(set.toArray()[i]);
        }
        System.out.println(builder.toString());



    }

    public static Character createRandomSybmbol() {
        return (char) (new Random().nextInt(26) + 'a');
    }
}


