import java.util.Scanner;

public class level_02_08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Approach 1: Brute Force
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);

        if (ch >= 'a' && ch <= 'm') {
            System.out.println("Character lies between a and m");
        } else if (ch >= 'n' && ch <= 'z') {
            System.out.println("Character lies between n and z");
        } else {
            System.out.println("Not an alphabet");
        }

    }
}
