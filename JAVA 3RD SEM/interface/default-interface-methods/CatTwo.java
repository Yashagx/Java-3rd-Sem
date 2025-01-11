public class CatTwo implements CanWalk, CanRun {
    
    public int getSpeed() {
        return 8;
    }

    public static void main(String[] args) {
        System.out.println(new CatTwo().getSpeed());
    }
}
