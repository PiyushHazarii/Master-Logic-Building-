import java.util.Scanner;

//4. Check if a number is divisible by both 3 and 5.
public class level3_02_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Approach 1: Brute Force.
        int a = 12;
        int b = 18;
 
        int hcf = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF = " + hcf); //O(log n) best
    }
}
