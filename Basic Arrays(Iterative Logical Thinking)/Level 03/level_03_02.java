import java.util.Scanner;

public class level_03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        num = Math.abs(num);

        int last = num % 10;
        int middle = (num / 10) % 10;
        int first = num / 100;

        if (middle > first && middle > last) {
            System.out.println("Middle digit is the largest");
        } else if (middle < first && middle < last) {
            System.out.println("Middle digit is the smallest");
        } else {
            System.out.println("Middle digit is neither largest nor smallest");
        }

    }
}
