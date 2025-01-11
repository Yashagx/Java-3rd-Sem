import java.util.*;

public class WrongAutoboxingOfIntegers {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        // Wrong removes index 1 -> numbers.remove(1);
        // Right removes value 1
        numbers.remove(new Integer(1));
        System.out.println(numbers.get(0));
    }
}
