import java.util.Scanner;

public class level_01_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Approach 1 : Brute Force
        int temp  = scanner.nextInt();
        int category;

        if (temp < 20) {
            category = 1;
        } else if (temp <= 30) {
            category = 2;
        } else {
            category = 3;
        }

        switch (category) {
            case 1:
                System.out.println("Cold");
                break;
            case 2:
                System.out.println("Warm");
                break;
            case 3:
                System.out.println("Hot");
                break;
        }

        // Approach 2 : optimal
        int temperature = 35;

        switch (temperature / 10) {
            case 0:
            case 1:
                System.out.println("Cold");
                break;
            case 2:
            case 3:
                System.out.println("Warm");
                break;
            default:
                System.out.println("Hot");
        }

//        how it works?

//                | Temp | temp / 10 | Output |
//                | ---- | --------- | ------ |
//                | 15   | 1         | Cold   |
//                | 25   | 2         | Warm   |
//                | 30   | 3         | Warm   |
//                | 35   | 3+        | Hot    |

    }
}
