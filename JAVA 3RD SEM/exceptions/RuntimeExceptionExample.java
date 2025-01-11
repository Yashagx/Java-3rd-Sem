public class RuntimeExceptionExample {

    public static void main(String[] args) {
        if (args.length > 0) {
            
            int argument = Integer.parseInt(args[0]);
            switch (argument) {
            
            // ArithmeticException
            case 0:
                int answer = 11 / 0;
            break;            

            // ArrayIndexOutOfBoundsException
            case 1:
                int[]  countsOfMoose = new int[3];
                int result = countsOfMoose[-1];
            break; 
            
            // ClassCastException
            case 2:
                String  type = "moose";
                Object  obj  = type;
                Integer number = (Integer) obj;
            break; 
            
            // IllegalArgumentException
            case 3:
                throw new IllegalArgumentException("# eggs must not be negative");
            
            // NullPointerException
            case 4:
                String name = null;
                name.length();
            break;
            
            // NumberFormatException
            case 5:
                Integer.parseInt("abc");
            break;

            default : 
                throw new RuntimeException();
            }
        }
    }    
}
