import java.util.*;

public class RemoveIf {
    
    public static void main(String[] args) {
        List<String> bunnys = new ArrayList<>();
        bunnys.add("poppy");
        bunnys.add("sloppy");
        bunnys.add("hopy");

        //[Option][1]. bunnys.removeIf( a -> a.startsWith("h") );
        //[Option][2].
        bunnys.removeIf( a -> a.charAt(0) == 'h');    
        
        System.out.println(bunnys);        
            
    }
}
