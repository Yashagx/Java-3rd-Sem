import java.util.*;

public class FinalReference {
    
    private static final ArrayList<String> finalReference = new ArrayList<>();

    public static void main(String[] args) {
        finalReference.add("changed");        
        finalReference = null;
    }
}
