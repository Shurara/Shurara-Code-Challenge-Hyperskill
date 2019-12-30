import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
        Integer number = scanner.nextInt();
        List<Integer> indexes = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (Integer item : integers) {
            indexes.add(Math.abs(item - number) );
        }
        Integer min = Collections.min(indexes);
        for(int i = 0; i < indexes.size(); i++){
            if(indexes.get(i) == min ){
               result.add(integers.get(i));
            }
        }
        Collections.sort(result);
        for (Integer item: result) {
            System.out.print(item + " ");
        }


    }
}