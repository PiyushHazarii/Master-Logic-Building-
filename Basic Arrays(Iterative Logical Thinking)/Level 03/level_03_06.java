import java.util.Scanner;

public class level_03_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Approach 1: Brute Force
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Quadrant I");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrant II");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrant III");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrant IV");
        } else if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println("Point lies on Y-axis");
        } else {
            System.out.println("Point lies on X-axis");
        }
    }
}
