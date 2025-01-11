public class StringPoolUnEquality {
    
    public static void main(String[] args){
        String x = "Hello World";
        String z = " Hello World".trim();
        System.out.println(x == z);
    }
}
