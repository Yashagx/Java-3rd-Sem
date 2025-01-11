public class BearTwo implements HerbivoreTwo, OmnivoreTwo {

    public int eatPlants(int quantity) {
        System.out.printf("Eat plants :%d \n", quantity);
        return quantity;
    }
    
    public void eatPlants() {
        System.out.println("Eat plants");
    }
}
