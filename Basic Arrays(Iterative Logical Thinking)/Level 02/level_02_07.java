import java.util.Scanner;

public class level_02_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Approach 1: Brute Force
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("Both numbers are even");
        } else if (a % 2 != 0 && b % 2 != 0) {
            System.out.println("Both numbers are odd");
        } else {
            System.out.println("One is even and one is odd");
        }

        //Aproach 2 : XOR operator

        if ((a % 2 == 0) ^ (b % 2 == 0)) {
            System.out.println("One is even and one is odd");
        } else if (a % 2 == 0) {
            System.out.println("Both even");
        } else {
            System.out.println("Both odd");
        }

//                WORKING OF XOR OPERATOR:

//                | A     | B     | A ^ B |
//                | ----- | ----- | ----- |
//                | true  | true  | false |
//                | true  | false | true  |
//                | false | true  | true  |
//                | false | false | false |



    }
}
