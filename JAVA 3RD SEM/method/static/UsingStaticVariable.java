public class CallingStaticVariable {
    public static void main(String[] args) {
        Koala k = new Koala();
        System.out.println(k.count);
        k = null;
        System.out.println(k.count);
    }
}
