import java.util.Scanner;

public class level_03_04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        //Approach 1 : brute Force
        num = Math.abs(num);

        if (num < 10) {
            System.out.println("Single-digit number");
        } else if (num < 100) {
            System.out.println("Double-digit number");
        } else {
            System.out.println("Multi-digit number");
        }

        // Approach 2: Optimal

        int num2 = sc.nextInt();
        int count =0;
        while(num2 > 0){
            count++;
            num2 /= 10;
        }

        if(count ==  1){
            System.out.println("Single digit");
        }else if(count == 2){
            System.out.println("Double digit");
        }else{
            System.out.println("Multiple Digit");
        }
    }
}
