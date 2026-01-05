import java.util.Scanner;

public class level2_02_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Approach 1 : Brute Force
        int num = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        System.out.println(sum == num ?
                "Perfect Number" : "Not Perfect");

        // Approach 2 : better
        sum = 1;  // reassign to 1 for doing different apporoaches

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (num > 1 && sum == num) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect");
        }

    }
}

