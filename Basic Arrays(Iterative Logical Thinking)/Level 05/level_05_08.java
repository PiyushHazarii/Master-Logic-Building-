import java.util.Scanner;

public class level_05_08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 0;
        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        if (sum > product) {
            System.out.println("Sum of digits is greater than product of digits");
        } else {
            System.out.println("Sum of digits is NOT greater than product of digits");
        }
    }
}
