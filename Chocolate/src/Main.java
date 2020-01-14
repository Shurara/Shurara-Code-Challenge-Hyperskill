import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int m = sr.nextInt();
        int k = sr.nextInt();

        if (k > m * n) {
            System.out.println("NO");
            return;
        }
        boolean isAbleToSplit = (k % m == 0) || (k % n == 0);
        System.out.println(isAbleToSplit ? "YES" : "NO");

    }
}

/*
if (k % n == 0 && m >= k / n || k % m == 0 && n >= k / m) {
        System.out.println("YES");
        } else {
        System.out.println("NO");
        }*/
