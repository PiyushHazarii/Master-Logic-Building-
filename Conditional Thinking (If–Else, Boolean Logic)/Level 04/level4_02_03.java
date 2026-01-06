import java.util.Scanner;

public class level4_02_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //7. Print Stars in Even Numbers (2, 4, 6, 8, 10)
        for(int i=2; i<=n; i+=2){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
