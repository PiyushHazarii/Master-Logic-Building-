import java.util.Scanner;

public class level3_02_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Approach 1 : Brute Force
        int n = sc.nextInt();

        // n/2 because the factors doesnot exist after crossing the middle one
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

    }
}

