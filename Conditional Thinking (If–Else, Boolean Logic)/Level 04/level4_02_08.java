import java.util.Scanner;

//12. Print Repeated Numbers per Row (Same Number Repeated)
public class level4_02_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }

}
