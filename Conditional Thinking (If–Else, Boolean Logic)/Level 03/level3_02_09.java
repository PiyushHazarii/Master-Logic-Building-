import java.util.Scanner;

public class level3_02_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   // first term
        int d = sc.nextInt();   // common difference
        int n = sc.nextInt();   // number of terms

        // Approach 1 : Brute Force
        int term = a;

        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term += d;
        }
        System.out.println(term);

        // Approach 2 : better {Formula based answer }

        for (int i = 0; i < n; i++) {
            System.out.print((a + i * d) + " ");
        }




    }
}
