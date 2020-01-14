import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        float[] arrayIncome = new float[n];
        float[] arrayPercent = new float[n];
        float[] arrayTaxes = new float[n];

        float x = 0;
        int y = 1;

        for(int i = 0; i < arrayIncome.length; i++) {
            arrayIncome[i] = scanner.nextFloat();
        }

        for(int j = 0; j < arrayPercent.length; j++) {
            arrayPercent[j] = scanner.nextFloat();
            arrayTaxes[j] = arrayIncome[j] * arrayPercent[j] / 100;

            if (arrayTaxes[j] > x) {
                x = arrayTaxes[j];
                y = j + 1;
            }

        }

        System.out.println(y);
    }
}