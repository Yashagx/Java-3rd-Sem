import java.time.*;

public class ManipulateLocalDateTwo{
    public static void main(String[] args){
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);
        
        dateTime = dateTime.minusMinutes(15);
        System.out.println(dateTime);
        
        dateTime = dateTime.minusHours(2);
        System.out.println(dateTime);

        dateTime = dateTime.minusDays(1);
        System.out.println(dateTime);

        dateTime = dateTime.minusMonths(1);
        System.out.println(dateTime);

    }
}

