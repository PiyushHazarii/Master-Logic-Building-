import java.util.Scanner;

//4. Check if a number is divisible by both 3 and 5.
public class level_01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n/3 == 0 && n/5 == 0){
            System.out.println(n +"is divisible by 3 and 5");
        }else{
            System.out.println(n +"is not divisible by 3 and 5");
        }

        sc.close();
    }
}
