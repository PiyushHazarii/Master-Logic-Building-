import java.util.Scanner;

//4. Check if a number is divisible by both 3 and 5.
public class level4_02_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j =1; j<=i; j++){
                if((i+j) %2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
