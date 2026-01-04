import java.util.Scanner;

public class level_04_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        double income = sc.nextDouble(); // 6 Lakh

        if (age > 18 && income > 500000) {
            System.out.println("Eligible for tax");
        } else {
            System.out.println("Not eligible for tax");
        }
    }
}
