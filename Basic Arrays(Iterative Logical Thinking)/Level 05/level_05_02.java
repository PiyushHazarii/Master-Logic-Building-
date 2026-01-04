import java.util.Scanner;

public class level_05_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Approach 1 : Brute Force
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (a * a + b * b == c * c ||
                a * a + c * c == b * b ||
                b * b + c * c == a * a) {

            System.out.println("Pythagorean Triplet");
        } else {
            System.out.println("Not a Pythagorean Triplet");
        }


        // Approach 2 :

        int x = Math.min(a, Math.min(b, c));
        int z = Math.max(a, Math.max(b, c));
        int y = a + b + c - x - z;

        if (x * x + y * y == z * z) {
            System.out.println("Pythagorean Triplet");
        } else {
            System.out.println("Not a Pythagorean Triplet");
        }
    }
}
