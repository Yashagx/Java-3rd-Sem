import java.util.Arrays;

public class SortingString {
    public static void main(String[] args){
        String[] strings = {"10", "9", "200"};
        Arrays.sort(strings);
        for (String string : strings) {
            System.out.print(string + " ");    
        }
    }
}
