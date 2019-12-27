import java.util.concurrent.*;


class FutureUtils {


    public static int determineCallableDepth(Callable callable) {
        Object temp = null;
        try {
            temp = callable.call();
        } catch (Exception e) {}
        return temp instanceof Callable ? 1 + determineCallableDepth((Callable) temp) : 1;
    }

}