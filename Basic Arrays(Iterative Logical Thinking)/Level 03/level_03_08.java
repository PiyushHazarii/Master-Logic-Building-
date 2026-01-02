import java.util.Scanner;

public class level_03_08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Approach 1: Brute Force
        int day = sc.nextInt(); // 1 to 7

        if (day >= 1 && day <= 5) {
            System.out.println("Weekday");
        } else if (day == 6 || day == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid day number");
        }

        // Ultra compact version
        System.out.println(day >= 1 && day <= 5 ? "Weekday" :
                day == 6 || day == 7 ? "Weekend" :
                        "Invalid");


    }
}
