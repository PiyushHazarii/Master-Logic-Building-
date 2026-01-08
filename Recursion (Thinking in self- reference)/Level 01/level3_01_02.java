import java.util.Scanner;

public class level3_01_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recursionFromNto1(n);

    }
    public static void recursionFromNto1(int n){
        if(n==0) return;

        System.out.println(n);
        recursionFromNto1(n-1);
    }
}
