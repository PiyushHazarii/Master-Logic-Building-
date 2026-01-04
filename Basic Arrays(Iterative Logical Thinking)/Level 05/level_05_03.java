import java.util.Scanner;

public class level_05_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Approach 1: Brute Force
        int day = sc.nextInt();
        int month = sc.nextInt();

        if (month < 1 || month > 12 || day < 1) {
            System.out.println("Invalid Date");
        } else if (month == 2) {
            if (day <= 28)
                System.out.println("Valid Date");
            else
                System.out.println("Invalid Date");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day <= 30)
                System.out.println("Valid Date");
            else
                System.out.println("Invalid Date");
        } else {
            if (day <= 31)
                System.out.println("Valid Date");
            else
                System.out.println("Invalid Date");
        }

        // Approach 2 : Optimal

        int[] daysInMonth = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        boolean isValid =
                month >= 1 && month <= 12 &&
                        day >= 1 && day <= daysInMonth[month - 1];

        System.out.println(isValid ? "Valid Date" : "Invalid Date");
    }
}
