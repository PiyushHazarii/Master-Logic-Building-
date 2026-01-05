import java.util.Scanner;

public class level3_02_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =  sc.nextInt();
        int b =  sc.nextInt();

        // Find first number ≥ a divisible by 7
        // if a is divisible by 7 then a but if a is not divisible by 7 like 23
        // then a+(7-a%7) == 23+(7-2) then here you find the first number that is divisible by 7.
        int start = (a % 7 == 0) ? a : a + (7 - a % 7);

        for (int i = start; i <= b; i += 7) {
            System.out.println(i);
        }

    }
}
