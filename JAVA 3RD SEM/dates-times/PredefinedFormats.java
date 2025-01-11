import java.time.*;
import java.time.format.*;

public class PredefinedFormats {
    
    public static void main(String[] args){
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 1);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        
        DateTimeFormatter shortFormatter    = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumFormatter   = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        DateTimeFormatter own               = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        
        System.out.println(dateTime.format(shortFormatter));
        System.out.println(dateTime.format(mediumFormatter));
        System.out.println(dateTime.format(own));
 
    }
}
