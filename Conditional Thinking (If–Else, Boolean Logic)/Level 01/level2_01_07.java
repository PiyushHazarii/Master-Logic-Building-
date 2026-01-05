import java.util.Scanner;
import java.util.stream.IntStream;

public class level2_01_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of even numbers = " + sum);

    }
}
