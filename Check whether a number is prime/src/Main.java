import java.util.Scanner;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args)throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ExecutorService executor = Executors.newCachedThreadPool(); // assign an object to it

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            executor.submit(new PrintIfPrimeTask(number));
        }
        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);
    }
}

class PrintIfPrimeTask implements Runnable {
    private final int number;

    public PrintIfPrimeTask(int number) {
        this.number = number;
    }

    public static boolean isPrime(int number) {

        if (number <= 1){
            return false; // 1 is not prime and also not composite
        }
        return IntStream.rangeClosed(2, number / 2).noneMatch(i -> number % i == 0);
    }

    @Override
    public void run() {
        if(isPrime(number)){
            System.out.println(number);
        }
    }
}
