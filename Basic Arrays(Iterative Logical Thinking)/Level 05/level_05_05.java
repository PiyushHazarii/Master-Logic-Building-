import java.util.Scanner;


// Arithmetic Progression: Three numbers a, b, c are said to be in Arithmetic Progression (AP)
//                          if the difference between consecutive terms is the same.

public class level_05_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Approach 1 : Brute Force
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((b - a) == (c - b)) {
            System.out.println("The numbers are in Arithmetic Progression");
        } else {
            System.out.println("The numbers are NOT in Arithmetic Progression");
        }
    }
}
