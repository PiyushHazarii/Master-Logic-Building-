import java.util.Arrays;

public class level_04_02 {
    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 4, 6, 2};
        int n = arr.length;

        // Step 1: Sort the array
        Arrays.sort(arr);

        double median;

        // Step 2: Check if count is odd or even
        if (n % 2 == 1) {
            // Odd count
            median = arr[n / 2];
        } else {
            // Even count
            median = (arr[(n / 2) - 1] + arr[n / 2]) / 2.0;
        }

        System.out.println("Median = " + median);
    }
}
