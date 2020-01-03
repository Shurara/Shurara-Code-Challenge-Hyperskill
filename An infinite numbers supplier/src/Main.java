// Posted from EduTools plugin
// Posted from EduTools plugin

import java.util.*;
import java.util.function.*;
import java.util.stream.*;


class FunctionUtils {
   /* public static void main(String[] args) {
        Supplier<Integer> sup = getInfiniteRange();
        for (int i = 0; i < 5; i++) {
            System.out.print(sup.get() + " ");
        }
        System.out.println("");
        Supplier<Integer> sup1 = getInfiniteRange();
        Supplier<Integer> sup2 = getInfiniteRange();
        for (int i = 0; i < 5; i++) {
            System.out.print(sup1.get() + " " + sup2.get() + " ");
        }
    }*/

    public static Supplier<Integer> getInfiniteRange() {
        List<Integer> list = Stream.iterate(0, i -> i + 1)
                .limit(100000)
                .collect(Collectors.toList());
        //Supplier<Integer> suppplier =
        return () -> {
            int count = 0;
            int result = list.get(count);
            if (count < list.size()-1) {
                list.remove(count++);
            }
            return result;
        };
    }

}
