import java.util.Scanner;

public class level_02_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Approach : 1 Brute Force
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else if (marks >= 0) {
            System.out.println("Grade F");
        } else {
            System.out.println("Invalid marks");
        }


        // Approach 2 : Using switch (Bucket Technique)

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else {
            switch (marks / 10) {
                case 10:
                case 9:
                    System.out.println("Grade A");
                    break;
                case 8:
                    System.out.println("Grade B");
                    break;
                case 7:
                    System.out.println("Grade C");
                    break;
                case 6:
                    System.out.println("Grade D");
                    break;
                default:
                    System.out.println("Grade F");
            }
        }


    }
}
