import java.util.Scanner;

public class level_02_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Approach 1: Brute Force
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }

        // Approach 2: Optimized Logic Using Max Side
        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c;

        if (a > 0 && b > 0 && c > 0 && (sum - max) > max) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}
