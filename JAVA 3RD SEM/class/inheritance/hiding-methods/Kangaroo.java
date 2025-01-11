public class Kangaroo extends Marsupial {
    
    public static boolean isBipped() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaro can hop : " + isBipped());
    }

    public static void main(String[] args) {
        Kangaroo k = new Kangaroo();
        k.getMarsupialDescription();
        k.getKangarooDescription();
    }
}
