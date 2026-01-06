import java.util.Scanner;

public class level4_02_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 6. Print a Right-Aligned Triangle of Stars
        for(int i =1; i<n ; i++){
            for(int j=n-1; j>0; j--){
                if(i < j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
