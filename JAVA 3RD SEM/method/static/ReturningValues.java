public class ReturningValues {
    
    public static void main(String[] args) {
        
        String letters = "abc";
        letters = letters(letters);

        int number = 1;     
        number(number);
        
        System.out.println(number + letters);  
    }
    
    public static String letters(String letters) {
        letters += "d";
        return letters;
    }
    
    public static int number(int number) {
        number++;
        return number;
    }
}
