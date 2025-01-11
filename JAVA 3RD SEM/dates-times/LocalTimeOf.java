import java.time.*;

public class LocalTimeOf{
    public static void main(String[] args){
        LocalTime timeOne   = LocalTime.of(6, 15);
        System.out.println(timeOne);

        LocalTime timeTwo   = LocalTime.of(6, 15, 30);
        System.out.println(timeTwo);

        LocalTime timeThree = LocalTime.of(6, 15, 30, 200);
        System.out.println(timeThree);
        
    }    
}
