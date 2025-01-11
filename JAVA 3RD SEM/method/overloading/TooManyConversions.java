public class TooManyConversions {
    public static void play(Long l) {
    }
    
    public static void play(Long... l) {
    }

    public static void main(String[] args) {
        play(4);
        play(4L);
    }
}
