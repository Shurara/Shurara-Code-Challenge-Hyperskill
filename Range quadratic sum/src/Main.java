public static long rangeQuadraticSum(int fromIncl, int toExcl) {


        return IntStream.range(fromIncl, toExcl)
        .map(x -> x*x)
        .reduce(0, (a,b)->a+b);
        }