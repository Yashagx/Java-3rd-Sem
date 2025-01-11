import java.time.*;

public class LocalDateTimeOf{
    public static void main(String[] args){
        LocalDateTime dateTimeOne = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        System.out.println(dateTimeOne);

        LocalDate dateOne = LocalDate.of(2015, Month.JANUARY, 20);
        LocalTime timeOne = LocalTime.of(6, 15, 30);
        LocalDateTime dateTimeTwo = LocalDateTime.of(dateOne, timeOne);
        System.out.println(dateTimeTwo);
    }
}
