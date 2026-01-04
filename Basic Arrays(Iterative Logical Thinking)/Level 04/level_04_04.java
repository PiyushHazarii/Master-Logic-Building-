import java.time.LocalDateTime;

public class level_04_04 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        int hour = now.getHour();
//        int minute = now.getMinute();

        if (hour < 12) {
            System.out.println("AM");
        } else {
            System.out.println("PM");
        }
    }
}
