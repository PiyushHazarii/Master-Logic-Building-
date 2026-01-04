import java.util.Scanner;


//Geometric progression: Three numbers a, b, c are in Geometric Progression (GP)
//                       if the ratio between consecutive terms is the same.
//                       eg: b/a == c/b
public class level_05_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Approach 1 : Brute Force
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (a != 0 && b != 0 && (b / a == c / b)) {
            System.out.println("The numbers are in Geometric Progression");
        } else {
            System.out.println("The numbers are NOT in Geometric Progression");
        }

    }
}
