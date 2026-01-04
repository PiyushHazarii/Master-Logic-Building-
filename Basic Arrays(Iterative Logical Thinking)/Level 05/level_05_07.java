import java.util.Scanner;

public class level_05_07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();   // 3-digit number
        num = Math.abs(num); // handle negative numbers

        int lastDigit = num % 10;
        int middleDigit = (num / 10) % 10;
        int firstDigit = num / 100;

        if (firstDigit + lastDigit == middleDigit) {
            System.out.println("Sum of first and last digit equals the middle digit");
        } else {
            System.out.println("Condition NOT satisfied");
        }

        // when there are n numbers then how to find the first number
//        int num = 987654;
//        num = Math.abs(num);   // handle negative numbers
//
//        while (num >= 10) {
//            num = num / 10;
//        }
//
//        int firstDigit = num;
//        System.out.println(firstDigit);


        // when there are n number then how to find the middle number

//        int num = 9876543;
//        num = Math.abs(num);
//
//        int temp = num;
//        int digits = 0;
//
//        first ye digit count karege
//        while (temp > 0) {
//            digits++;
//            temp /= 10;
//        }
//
//        // Only if digits are odd
//        if (digits % 2 == 1) {
//            int remove = digits / 2;
//
//        then half kar dega digit ko
//
//            for (int i = 0; i < remove; i++) {
//                num /= 10;
//            }
//
//            int middleDigit = num % 10;
//            System.out.println("Middle digit = " + middleDigit);
//        } else {
//            System.out.println("No single middle digit (even number of digits)");
//        }


    }
}
