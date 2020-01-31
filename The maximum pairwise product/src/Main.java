

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        ArrayList<Integer> inputList = IntStream.range(0, n).map(i -> scanner.nextInt())
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

      /*  List<Integer> pairwise = inputList.stream()
                .map(inputList::indexOf)
                .skip(1)
                .map(index -> inputList.get(index) * inputList.get(index - 1))
                .collect(Collectors.toList());

        Integer max = pairwise.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();*/


        System.out.println(inputList.size() <= 1 ? inputList.get(0) : getMax(inputList));
    }

    public static int getMax(List<Integer> list) {
        List<Integer> created = new ArrayList<>();

        for (int i = 1; i < list.size(); i++) {
            created.add(list.get(i) * list.get(i - 1));
        }

        return created.stream().max(Integer::compareTo).get();
    }
}