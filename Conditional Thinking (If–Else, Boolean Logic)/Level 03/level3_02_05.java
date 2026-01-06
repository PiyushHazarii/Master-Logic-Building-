import java.util.Scanner;

public class level3_02_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Brute Force:
        // LCM (Least Common Multiple) is the smallest positive number that is divisible by both numbers.
        int lcm = Math.max(a, b);

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;
            }
            lcm++;
        }

        System.out.println("LCM = " + lcm);


        // Optimal approach :
        int x = a;
        int y = b;
        while (b >0){
            int remainder = a% b;
            a = b;
            b= remainder;
        }

//        now

        int lcmUsingHcf = (x*y) / a;
        System.out.println(lcmUsingHcf); //O(log min(a, b)) best
    }
}
