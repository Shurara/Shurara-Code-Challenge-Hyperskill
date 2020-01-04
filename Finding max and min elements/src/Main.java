public static<T> void findMinMax(
        Stream<?extends T> stream,
        Comparator<? super T> order,
        BiConsumer<? super T,?super T> minMaxConsumer){
        List<? extends T> collect = stream.collect(Collectors.toList());
        T min = collect.stream().min(order).orElse(null);
        T max = collect.stream().max(order).orElse(null);
        minMaxConsumer.accept(min, max );

        }