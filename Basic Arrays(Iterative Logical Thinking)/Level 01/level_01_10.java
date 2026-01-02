import java.util.Scanner;

public class level_01_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Approach 1: Brute Force
        char ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch)) {
            System.out.println("Uppercase letter");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("Lowercase letter");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }

        // Approach 2: Using ASCII Range Checks
        char chh = sc.next().charAt(0);

        if (chh >= 'A' && chh <= 'Z') {
            System.out.println("Uppercase letter");
        } else if (chh >= 'a' && chh <= 'z') {
            System.out.println("Lowercase letter");
        } else if (chh >= '0' && chh <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }

        // Approach 3: Using switch with Ranges
//        char chhh = sc.next().charAt(0);
//
//        switch (chhh) {
//            case 'A'...'Z':
//                System.out.println("Uppercase letter");
//                break;
//            case 'a'...'z':
//                System.out.println("Lowercase letter");
//                break;
//            case '0'...'9':
//                System.out.println("Digit");
//                break;
//            default:
//                System.out.println("Special character");
//        }


        // Approach : 4 Using Regular Expressions
        char chhhh = sc.next().charAt(0);

        String s = String.valueOf(chhhh);

        if (s.matches("[A-Z]")) {
            System.out.println("Uppercase letter");
        } else if (s.matches("[a-z]")) {
            System.out.println("Lowercase letter");
        } else if (s.matches("[0-9]")) {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }




    }
}
