import java.util.Scanner;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();
        int[] array = Stream.generate(scanner::next)
                .limit(sizeOfArray)
                .mapToInt(Integer::parseInt)
                .toArray();
        int longest = 1;
        int tempLongest = 1;
        for (int i = 1; i < array.length; i++) {
            if(array[i]> array[i-1]){
                tempLongest++;
                if(tempLongest > longest){
                    longest = tempLongest;
                }
            }else{
                tempLongest = 1;
            }
        }
        System.out.println(longest);
    }
}