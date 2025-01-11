import java.time.*;

public class UseOfLocalDateGetProperties{
    public static void main(String[] args){
        LocalDate date = LocalDate.of(2020, Month.MARCH, 1);
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println(date.getDayOfYear());
    }
}

