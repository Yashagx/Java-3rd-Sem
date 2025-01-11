public class Wolf extends Canine {
    
    public int getAverageWeight() {
        return super.getAverageWeight() + 20;
    }

    public static void main(String[] args) {
        Canine canine = new Canine();
        System.out.println(canine.getAverageWeight());

        Wolf wolf = new Wolf();
        System.out.println(wolf.getAverageWeight());
    }    
}
