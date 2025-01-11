public class AssigningToStaticVariable {
    public static void main(String[] args) {
        Koala.count = 4;
        Koala k1 = new Koala();
        Koala k2 = new Koala();
        k1.count = 6;
        k2.count = 5;
        System.out.println(Koala.count); 
    }
}
