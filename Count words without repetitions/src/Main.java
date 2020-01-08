import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();
        scanner.nextLine();
        System.out.println(Stream.generate(() -> Arrays.stream(scanner.nextLine().split("\\s+")))
                .limit(number)
                .flatMap(s -> s)
                .map(String::toLowerCase)
                .distinct()
                .count());
    }
}

/*
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();
        scanner.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < numberOfLines; i++) {
           list.addAll(Arrays.asList(scanner.nextLine().trim().split(" ")));
        }

        //System.out.println(list);
        long count = list.stream().map(String::toLowerCase).distinct().count();
        System.out.println(count);
    }
}*/
