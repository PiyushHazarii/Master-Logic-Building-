import java.util.Scanner;

public class level_02_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Approach 1: Brute Force
        int month = sc.nextInt();

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 days");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            default:
                System.out.println("Invalid month number");
        }

    }
}
