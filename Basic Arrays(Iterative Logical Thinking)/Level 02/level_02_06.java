import java.util.Scanner;

public class level_02_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Approach 1: Brute Force
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        // Ternary Operator
        String result = (age < 0) ? "Invalid age"
                : (age >= 18) ? "Eligible to vote"
                : "Not eligible to vote";

        System.out.println(result);



    }
}
