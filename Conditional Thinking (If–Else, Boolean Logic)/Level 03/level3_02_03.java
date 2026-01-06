import java.util.Scanner;

public class level3_02_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Approach 1: Brute Force.
        int hcf = 1;

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF = " + hcf);

        // Appraoch 2: Optimal approach {Euclidean Algorithm – Using Loop}
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        System.out.println("HCF " +a);


    }
}
