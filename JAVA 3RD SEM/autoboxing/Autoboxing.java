import java.util.*;

public class Autoboxing {
    
    public static void main(String...args){
        List<Double> weights = new ArrayList<>();
        weights.add(50.5);
        weights.add(new Double(60));
        weights.remove(50.5);
        double first = weights.get(0);
        System.out.println(first);        
    }
}
