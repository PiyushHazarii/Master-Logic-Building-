import java.util.Scanner;

public class level4_02_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //8. Print Stars in Odd Numbers (1, 3, 5, 7, 9)
        int n = sc.nextInt();
        for(int i=1; i<=n; i+=2){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
