import java.time.LocalDate;

public class level_05_09 {
    public static void main(String[] args) {
        // Date format: yyyy, mm, dd
        LocalDate date1 = LocalDate.of(2024, 3, 15);
        LocalDate date2 = LocalDate.of(2024, 4, 10);

        if (date1.isBefore(date2)) {
            System.out.println("First date comes earlier");
        }
        else if (date1.isAfter(date2)) {
            System.out.println("Second date comes earlier");
        }
        else {
            System.out.println("Both dates are the same");
        }
    }
}
