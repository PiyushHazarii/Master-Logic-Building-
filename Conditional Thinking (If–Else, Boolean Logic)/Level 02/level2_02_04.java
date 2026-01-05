import java.util.Scanner;

//4. Check if a number is divisible by both 3 and 5.
public class level2_02_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}
