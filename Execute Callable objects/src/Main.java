
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.IntStream;


class FutureUtils {

    public static int executeCallableObjects(List<Future<Callable<Integer>>> items) {
        Collections.reverse(items);
      int sum = 0;
       /* for (Future<Callable<Integer>> future : items) {
            try {
                sum += future.get().call();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sum;*/
       sum = items.stream().mapToInt(future -> {
           try {
               return future.get().call();
           } catch (Exception e) {
               e.printStackTrace();
           }
           return 0;
       }).sum();

    return sum;
    }

}