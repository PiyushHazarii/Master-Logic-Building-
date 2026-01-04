import java.util.Scanner;

public class level_05_04 {
    public static void main(String[] args) {
//        This is the same problem where you solve this problem
//        https://leetcode.com/problems/angle-between-hands-of-a-clock/
//        1344. Angle Between Hands of a Clock

        Scanner sc = new Scanner(System.in);
        double hour = sc.nextDouble();

        double minute = sc.nextDouble();

        double minuteAngle = minute * 6;                    // as 360 degree per hour then 6 degree per minute
        double hourAngle = (hour % 12) * 30 + minute * 0.5; // as 360 degree in 12 hour then 30 degree in 1 hour
                                                            // and 30 degree in 1 hour then 0.5 degree in 1 minute so

        double angle = Math.abs(minuteAngle - hourAngle);

        System.out.println(Math.min(angle, 360 - angle));
    }
}
