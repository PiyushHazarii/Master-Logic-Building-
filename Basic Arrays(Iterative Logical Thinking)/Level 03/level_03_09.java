import java.util.Scanner;

public class level_03_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Approach 1: Brute Force
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();

        // formula to find the third angle of the traingle
        int thirdAngle = 180 - (angle1 + angle2);

        if (angle1 > 0 && angle2 > 0 && thirdAngle > 0) {
            System.out.println("Third angle is: " + thirdAngle);
        } else {
            System.out.println("Invalid triangle");
        }

    }
}
