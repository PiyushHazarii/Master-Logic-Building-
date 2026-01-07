import java.util.Scanner;

public class level4_02_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i+1; k++){
                if((k%i)==0){
                    System.out.print(1);
                }else {
                    System.out.print(k%i);
                }
            }
            System.out.println();
        }

    }
}
