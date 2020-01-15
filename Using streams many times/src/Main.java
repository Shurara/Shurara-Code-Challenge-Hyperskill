import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.*;
import java.util.stream.*;

class FunctionUtils {

    public static <T> Supplier<Stream<T>> saveStream(Stream<T> stream) {

        List<T> list = stream.collect(Collectors.toList());

        return () -> list.stream();

    }

}

/*
import java.util.*;

        import java.util.function.*;
        import java.util.stream.*;

class FunctionUtils {

    public static <T> Supplier<Stream<T>> saveStream(Stream<T> stream) {
        ArrayList<T> list = new ArrayList<>();
        stream.forEach(list::add);
        return list::stream;
    }

}*/
