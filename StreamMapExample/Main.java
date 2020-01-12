/*

Map and flatMap → Match lists and numbers
*/

package StreamMapExample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());
        List<Integer> generated = numbers.stream()
                .flatMap(n -> Stream.generate(() -> n).limit(n))
                .collect(Collectors.toList());
        System.out.println(generated);
        List<Integer> generated2 = numbers.stream()
                .flatMapToInt(n -> IntStream.rangeClosed(1, n))
                .boxed()
                .collect(Collectors.toList());
        System.out.println(generated2);
        List<Integer> generated3 = numbers.stream()
                .flatMapToInt(n -> IntStream.iterate(n, val -> val + 1).limit(n))
                .boxed()
                .collect(Collectors.toList());
        System.out.println(generated3);
        List<Integer> generated4 = numbers.stream()
                .flatMap(Stream::of)
                .collect(Collectors.toList());
        System.out.println(generated4);
    }
}
/*
        [1,2,2,3,3,3,4,4,4,4,5,5,5,5,5]
        [1,1,2,1,2,3,1,2,3,4,1,2,3,4,5]
        [1,2,3,3,4,5,4,5,6,7,5,6,7,8,9]
        [1,2,3,4,5]
 */
