import java.util.Scanner;

public class level_01_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Approach 1 : Brute force
        // this line will help me to take only the single character even i put the whole string
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }

        // Approach 2: Better
        char chh = sc.next().charAt(0);

        if ("aeiouAEIOU".contains(String.valueOf(ch))) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }


    }
}
