import java.util.Scanner;

public class level_02_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//        Approach 1: Optimized Logic Using Max Side
//        For the Math.max(a, b) function(comparing two numbers), the time complexity is O (1) (constant time).

//        For functions that find the maximum in a collection or stream(like Collections.max()or Stream.max()), the
//        time complexity is O (N) (linear time),where N is the number of elements in the collection or stream.

        int max = Math.max(a, Math.max(b, c));
        int sum = a + b + c;

        if (a > 0 && b > 0 && c > 0 && (sum - max) > max) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }

        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}
