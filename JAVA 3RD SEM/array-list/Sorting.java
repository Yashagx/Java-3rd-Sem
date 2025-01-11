import java.util.*;

public class Sorting {

    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(81);
        numbers.add(5);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
