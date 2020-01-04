// Posted from EduTools plugin


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.util.stream.*;


class FunctionUtils {
   /* static int number = new Scanner(System.in).nextInt();
    public static void main(String[] args) {
        Supplier<Integer> sup = getInfiniteRange();
        for (int i = 0; i < number; i++) {
            System.out.print(sup.get() + " ");
        }
        System.out.println("");
        Supplier<Integer> sup1 = getInfiniteRange();
        Supplier<Integer> sup2 = getInfiniteRange();
        for (int i = 0; i < number; i++) {
            System.out.print(sup1.get() + " " + sup2.get() + " ");
        }
    }*/
   
        public static Supplier<Integer> getInfiniteRange() {
            return IntStream.iterate(0, i -> i + 1).iterator()::next;
        }

    }

   /* public static Supplier<Integer> getInfiniteRange() {
        List<Integer> list = Stream.iterate(0, i -> i + 1)
                .limit(212513)
                .collect(Collectors.toCollection(ArrayList::new));
        //Supplier<Integer> suppplier =
        final int[] count = {list.get(0)};
        return () -> {
            int result = 0;
            if (count[0] < list.size()-1) {
                result = list.get(count[0]++);
            }


            return result;
        };
    }*/

}
