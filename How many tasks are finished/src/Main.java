import java.util.*;
import java.util.concurrent.*;
import java.util.stream.IntStream;


class FutureUtils {

    public static int howManyIsDone(List<Future> items) {
       return (int) items.stream().filter(f -> f.isDone()).count();
    }

}