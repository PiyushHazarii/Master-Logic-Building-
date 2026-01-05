import java.util.Scanner;

public class level2_01_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Brute Force
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial = " + fact);

        // recursion approach
        int factorial = fact(n);
        System.out.println(factorial);

    }

    // this is the recursion approach
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
