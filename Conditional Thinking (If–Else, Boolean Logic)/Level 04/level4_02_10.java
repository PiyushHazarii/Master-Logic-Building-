import java.util.Scanner;

public class level4_02_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print((count%10)+" ");
                count++;
            }
            System.out.println();
        }
    }
}
