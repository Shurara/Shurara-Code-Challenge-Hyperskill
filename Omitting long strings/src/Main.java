public static List<String> omitLongStrings(List<String> strings) {

    return strings.stream().filter(x -> x.length()<4).collect(Collectors.toList());
}