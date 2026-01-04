import java.util.Scanner;

public class level_04_06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > 0 && b > 0 && (a + b) < 100) {
            System.out.println("Both numbers are positive and sum is less than 100");
        } else {
            System.out.println("Condition not satisfied");
        }
    }
}
