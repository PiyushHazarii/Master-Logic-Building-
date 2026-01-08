import java.util.Scanner;

public class level3_01_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
    static void printOddRecursively(int n){
        if(n%2 != 0){
            System.out.println(n);
        }
        printOddRecursively(n-1);
    }
}
