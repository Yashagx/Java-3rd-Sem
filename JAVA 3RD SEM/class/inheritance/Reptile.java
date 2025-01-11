public class Reptile {
    public boolean hasLegs() throws InsufficientDataException {
        throw new InsufficientDataException();
    }
    
    protected double getWeights() throws Exception {
        return 2;
    }
}
