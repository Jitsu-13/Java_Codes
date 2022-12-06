package Handling_DateandTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
public class _1 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);

        LocalTime time=LocalTime.now();
        System.out.println(time);

        LocalDateTime datetime=LocalDateTime.now();
        System.out.println(datetime);
    }
}
