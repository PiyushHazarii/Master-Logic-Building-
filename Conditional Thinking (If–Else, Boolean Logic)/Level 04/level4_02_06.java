import java.util.Scanner;

//10. Print Stars and Spaces Alternating (Stars and Blank Spaces)
public class level4_02_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("b");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                if (k == 0 || k % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("b");
                }
            }
            System.out.println();
        }

    }
}

