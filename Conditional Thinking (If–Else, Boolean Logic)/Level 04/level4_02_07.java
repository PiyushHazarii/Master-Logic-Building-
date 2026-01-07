import java.util.Scanner;

//11. Print Numbers in an Increasing Sequence (1, 12, 123, 1234, 12345)
public class level4_02_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
