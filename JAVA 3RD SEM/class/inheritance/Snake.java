public class Snake extends Reptile {
    
    public boolean hasLegs() {
        return false;
    }

    public double getWeights() throws InsufficientDataException {
        return 2;
    }
}
