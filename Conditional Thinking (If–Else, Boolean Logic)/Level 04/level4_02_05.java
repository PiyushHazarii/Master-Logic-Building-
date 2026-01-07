import java.util.Scanner;


public class level4_02_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // 9. Print a Centered Pyramid of Stars
        // there is a concept of for loop ladder

        for(int i =0; i<n; i++){

            // print the star just n-i-1 means just pring the space 1 minus times because i starts from 0 there for n-i-1
            for(int j =0; j< n-i-1; j++){
                System.out.print(" ");
            }

            // this is for just start the print from 2*i +1 time because i starts from 0 so that 1 step ahead.
            for(int k =0; k<2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
