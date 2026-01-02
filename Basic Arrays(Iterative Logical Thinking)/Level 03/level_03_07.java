import java.util.Scanner;

public class level_03_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Approach 1: Brute Force
        int amount = sc.nextInt();

        if (amount > 0 && amount % 100 == 0) {
            System.out.println("Yes, the amount can be evenly divided");
        } else {
            System.out.println("No, the amount cannot be evenly divided");
        }



    }
}
