public class BearThree implements HerbivoreThree, OmnivoreThree {
    public int eatPlants() {
        System.out.println("Eating plants: 10");
        return 10;
    }
    
    public void  eatPlants() {
        System.out.println("Eating plants");
    }
}
