public class ForCompilationErrors {
    
    public static void main(String[] args){
        // Redeclaring a Variable in the Initialization Block
        // int x = 0;
        // for( long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
        //    System.out.print(x + " ");
        // }
        
        // Using Incompatible Data Types in the Initialization Block
        // for(long y = 0, int x = 4; x < 5 && y < 10; x++, y++) {
        //    System.out.print(x + " ");
        // }

        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x);
    }
}
