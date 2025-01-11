public class Kangaroo extends Marsupial {
    
    public boolean isBipped() {
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaro hop on two legs : " + isBipped());
    }    
    
    public static void main(String[] args) {
        Kangaroo k = new Kangaroo();
        k.getMarsupialDescription();
        k.getKangarooDescription();
    }   
}
