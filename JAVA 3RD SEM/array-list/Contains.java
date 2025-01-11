import java.util.*;

public class Contains{
    public static void main(String...args){
        List<String> birds = new ArrayList<>();
        birds.add("hawk");
        System.out.println(birds.contains("hawk"));
        System.out.println(birds.contains("robin"));
    }
}
