import java.time.*;

public class ManipulateLocalDate {
    
    public static void main(String...args){
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);

        date = date.plusDays(1);
        System.out.println(date);

        date = date.plusWeeks(2);
        System.out.println(date);
        
        date = date.plusMonths(1);
        System.out.println(date);
        
        date = date.plusYears(5);
        System.out.println(date);
        
    }
}
