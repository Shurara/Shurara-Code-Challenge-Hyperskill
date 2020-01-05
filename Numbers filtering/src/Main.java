public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {

        List<Integer> collect = IntStream.concat(evenStream, oddStream)
        .filter(x -> x % 15 == 0)
        .sorted()
        .skip(2)
        .boxed()
        .collect(Collectors.toList());

        return collect.stream().mapToInt(Integer::intValue);

        }