import java.time.*;
import java.time.format.*;

public class UsageOfDateTimeFormatter {
    public static void main(String[] args){
        LocalTime time  = LocalTime.of(11, 12, 34);
        LocalDate date  = LocalDate.of(2021, Month.JANUARY, 1);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        
/*      
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
*/
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortFormatter.format(date));
        System.out.println(shortFormatter.format(dateTime));
        

    }
}
