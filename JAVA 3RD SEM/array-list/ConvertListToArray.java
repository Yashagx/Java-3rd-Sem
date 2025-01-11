import java.util.*;

public class ConvertListToArray {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        
        Object[] objectsArray = list.toArray();
        System.out.println(objectsArray.length);
        
        String[] stringsArray = list.toArray(new String[0]);
        System.out.println(stringsArray.length);
    }
}
