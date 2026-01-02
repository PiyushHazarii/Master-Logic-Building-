import java.util.Scanner;

public class level_02_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Approach 1: Brute Force
        int hour = sc.nextInt();

        if (hour < 0 || hour > 23) {
            System.out.println("Invalid hour");
        } else if (hour >= 5 && hour <= 11) {
            System.out.println("Good Morning");
        } else if (hour <= 16) {
            System.out.println("Good Afternoon");
        } else if (hour <= 20) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night");
        }

        //Approach 2 : Mathematical Bucket
        // There is a loop hole find it
        if (hour < 0 || hour > 23) {
            System.out.println("Invalid hour");
        } else {
            switch (hour / 5) {
                case 1:
                case 2:
                    System.out.println("Good Morning");
                    break;
                case 3:
                    System.out.println("Good Afternoon");
                    break;
                case 4:
                    System.out.println("Good Evening");
                    break;
                default:
                    System.out.println("Good Night");
            }
        }
        // Answer : Jab bhi 4 ya 4 se zyda aayega to good evening hi print karega good night tak
        // kabhi nhi pahuchta hai isme ....



    }
}
