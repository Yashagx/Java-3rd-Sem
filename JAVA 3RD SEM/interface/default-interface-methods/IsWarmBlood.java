public interface IsWarmBlood {

    boolean hasScales();

    public default double getTemperature() {
        return 10.0;
    }
}
