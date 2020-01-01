import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = Arrays.stream(scanner.nextLine().split("\\s+"))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println(s);
    }
}

/*
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] str = new Scanner(System.in).nextLine().split(" ");
        int elem = 0;

        for (int i = 1; i < str.length; ++i) {
            if (str[i].length() > str[elem].length()) {
                elem = i;
            }
        }

        System.out.println(str[elem]);
    }
}*/
