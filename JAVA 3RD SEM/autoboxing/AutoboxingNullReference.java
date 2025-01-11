import java.util.*;

public class AutoboxingNullReference {
    public static void main(String[] args){
        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        int height = heights.get(0);
    }
}
