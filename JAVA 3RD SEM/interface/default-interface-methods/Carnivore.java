public interface Carnivore {
    public default void eatMeat();
    public int getRequiredFoodAmount() {
        return 13;
    }
}
