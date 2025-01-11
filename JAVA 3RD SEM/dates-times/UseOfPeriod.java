import java.time.*;

public class UseOfPeriod {
    
    public static void main(String[] args){

        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end   = LocalDate.of(2015, Month.MARCH, 31);
        Period  period  = Period.ofMonths(1);
        performAnimalEnrichment(start, end, period);
        
    }
    
    static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period){
        LocalDate upTo = start;
        while(upTo.isBefore(end)){
            upTo = upTo.plus(period);
            System.out.println("Enjoyment for animals.");
        }
    }

}
