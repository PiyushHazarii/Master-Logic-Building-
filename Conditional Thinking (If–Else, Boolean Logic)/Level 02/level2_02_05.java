import java.util.Scanner;

public class level2_02_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int squareOfDigits=0;

        while(n>0){
            int digit = n%10;
            squareOfDigits += digit*digit*digit; //Math.pow(digit, 3)
            n /= 10;
        }

        if(original == squareOfDigits){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not an armstrong");
        }
    }
}
