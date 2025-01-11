import java.util.*;

public class ConvertArrayToList {

    public static void main(String[] args){
        String[]    array = {"hawk", "robin"};
        List<String>    list = Arrays.asList(array); 
        System.out.println(list.size());
        list.set(1, "test");
        array[0] = "new";
        for (String el : array){
            System.out.println(el);
        }
        list.remove(0);
    }

}
