public class ExceptionI {
    
    public static void main(String[] args) throws Exception {
        try {
            throw new RuntimeException();
        } catch ( RuntimeException e) {
            throw new RuntimeException();
        } finally {
            throw new Exception();
        }
    }
}
