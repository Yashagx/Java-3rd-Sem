import java.time.*;

public class IsBefore {
    public static void main(String[] args){
        
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end   = LocalDate.of(2015, Month.MARCH, 30);
        
        rotateToys(start, end);    
    }

    public static void rotateToys(LocalDate start, LocalDate end){  
        LocalDate before = end;
        while(start.isBefore(before)){
            System.out.println("Rotate toys...");
            start = start.plusMonths(1);
        }
    }

    
}
