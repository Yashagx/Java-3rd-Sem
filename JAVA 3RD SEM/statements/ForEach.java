public class ForEach {
    
    public static void main(String[] args) {
        // final String[] names = new String[3];
        // names[0] = "Lisa";
        // names[1] = "Kevin";
        // names[2] = "Roger";
        // for(String name : names) {
        //    System.out.print(name + ", ");
        // }
        java.util.List<String> values = new java.util.ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for(String value : values) {
            System.out.print(value + ", ");
        }
    }
    
}
