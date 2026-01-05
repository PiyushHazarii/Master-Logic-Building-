import java.util.Scanner;

public class level2_02_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Approach 1: Brute Force
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = (reversed * 10) + digit;
            n /= 10;
        }

        if (original == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        // Better Approach: when the input is string then we can do the best otherwise that approach is good enough

    }
}
