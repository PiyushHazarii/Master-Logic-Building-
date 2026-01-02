import java.util.Scanner;

public class level_03_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Approach : 1 Brute Force
        int num = 4334;      // any 4-digit number
        num = Math.abs(num);

        if (num / 1000 == num % 10) {
            System.out.println("First and last digits are equal");
        } else {
            System.out.println("First and last digits are not equal");
        }
    }
}
