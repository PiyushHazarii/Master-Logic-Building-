import java.util.Arrays;
import java.util.Scanner;

public class level_04_01 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        // Approach 1: Brute Force
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("Fizz");
        } else if (num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}
