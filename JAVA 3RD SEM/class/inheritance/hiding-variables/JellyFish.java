public class JellyFish extends Animal {
    public int length = 5;

    public static void main(String[] args) {
        JellyFish jellyfish = new JellyFish();
        System.out.println(jellyfish.length);

        Animal    animal    = new JellyFish();
        System.out.println(animal.length);
    
    }
}
