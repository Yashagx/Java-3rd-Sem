import java.util.*;

public class Set {
    public static void main(String...args){
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        System.out.println(birds.size());
        birds.set(0, "robin");
        System.out.println(birds.isEmpty());
        System.out.println(birds.size());
        birds.set(1, "robin");
    }    
}
