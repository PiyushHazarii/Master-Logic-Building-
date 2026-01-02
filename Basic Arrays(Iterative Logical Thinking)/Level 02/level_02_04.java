import java.util.Scanner;

public class level_02_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("Zero cannot be used for multiple check");
        }else if (a % b == 0 || b % a == 0) {
            System.out.println("One number is a multiple of the other");
        } else {
            System.out.println("Not multiples");
        }

    }
}
