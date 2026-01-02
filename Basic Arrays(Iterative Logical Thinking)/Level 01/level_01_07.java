import java.util.Scanner;
import java.util.stream.IntStream;

public class level_01_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int y = sc.nextInt();

        // Approach 1: Brute Force
        if(m > n && m > y){
            System.out.println(m + " is the greatest one");
        }else if(n>m && n>y){
            System.out.println(n +" is the greatest one");
        }else{
            System.out.println(y +" is the greatest one");
        }


        // Approach 2: Inbuilt function
        int max = Math.max(m, Math.max(n,y));
        System.out.println(max + " is the greatest one");


        // Approach 3: Pure Logic
        int largest = m;

        if (n > largest) {
            largest = n;
        }
        if (y > largest) {
            largest = y;
        }
        System.out.println("Largest number is: " + largest);


        // Approach 4: Advanced
        int largestno = IntStream.of(m, n, y).max().getAsInt();
        System.out.println("Largest number is: " + largestno);


    }
}
