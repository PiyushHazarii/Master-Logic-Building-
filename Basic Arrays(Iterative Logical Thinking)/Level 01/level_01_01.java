import java.util.Scanner;

//1. Take a number and print whether it’s positive, negative, or zero.
public class level_01_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n > 0) {
            System.out.println(n + " is Positive");
        } else if (n < 0) {
            System.out.println(n + " is Negative");
        } else {
            System.out.println(n + " is Zero");
        }
        sc.close();
    }
}
