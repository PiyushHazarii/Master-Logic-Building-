import java.util.Scanner;

public class level_01_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        if(m > n){
            System.out.println(m + " is Greater");
        }else{
            System.out.println(n +" is Greater");
        }
    }
}
