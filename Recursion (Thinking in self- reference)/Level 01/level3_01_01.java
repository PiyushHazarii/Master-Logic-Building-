import java.util.Scanner;

public class level3_01_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRecursion(n);


    }
    public static void printRecursion(int n) {
        if (n == 0) {
            return ;
        }
        printRecursion(n - 1);

        System.out.print(n + " ");
    }
}
