import java.util.Scanner;

public class level2_02_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Apprach 1: Brute Force
        int[] fib = new int[n];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();

        // Apprpoach 2 : recursion
        for(int i=0; i<n; i++){
            System.out.print(fab(i));
        }

    }
    static int fab(int n){
        if(n == 0){
            return 0;
        }else if(n == 1){
            return  1;
        }else{
            return fab(n-1)+fab(n-2);
        }
    }
}
