import java.time.*;

public class LocalDateOf{
    public static void main(String...args){
        LocalDate dateOne = LocalDate.of(2015, 1, 20);
        LocalDate dateTwo = LocalDate.of(2015, Month.JANUARY, 20);
        System.out.println(dateOne);
        System.out.println(dateTwo);
    }
}
