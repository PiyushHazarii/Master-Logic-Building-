import java.util.Scanner;

public class level4_02_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0, b = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += a;

            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println("Sum = " + sum);
    }
}
