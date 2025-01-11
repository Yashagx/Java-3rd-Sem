public class PrimitiveTypes {
    public static void main(String[] args) {
        PrimitiveTypes p = new PrimitiveTypes();
        p.fly(123);
        p.fly(123L);
        p.fly(123l);
    }
    
    public void fly(int n) {
        System.out.println("int");
    }
    
    public void fly(long n) {
        System.out.println("long");
    }
}
