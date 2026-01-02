import java.util.Scanner;

public class level_03_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Approach 1: Brute Force
        int num = sc.nextInt();

        num = Math.abs(num);

        if (num % 7 == 0 || num % 10 == 7) {
            System.out.println("Yes, it is a multiple of 7 or ends with 7");
        } else {
            System.out.println("No, it is neither");
        }
    }
}
