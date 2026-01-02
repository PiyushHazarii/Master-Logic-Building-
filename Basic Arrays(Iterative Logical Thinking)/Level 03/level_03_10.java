import java.util.Scanner;

public class level_03_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Approach 1: Brute Force
        int n = sc.nextInt();

        boolean isPerfectSquare = false;

        for (int i = 0; i <= n / 2; i++) {
            if (i * i == n) {
                isPerfectSquare = true;
                break;
            }
        }
        if (isPerfectSquare)
            System.out.println("Perfect square");
        else
            System.out.println("Not a perfect square");

//====================================================================================================================


        // Approach 2: better approach
        // when we subtract the odd to the n continuously then if it is a perfect square then the number becomes 0;

        int odd = 1;

        while (n > 0) {
            n -= odd;
            odd += 2;
        }

        if (n == 0)
            System.out.println("Perfect square");
        else
            System.out.println("Not a perfect square");

//        ====================================================================================================================

//      3. BEST APPROACH (Binary Search – Optimal) that will added later
    }
}
