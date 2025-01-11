public class Bunny {
    
    private String  color;
    private int     length;
    private int     height;

    public Bunny() {
        System.out.println("Constructor");
    }

    public Bunny(String color) {
        this.color = color;
    }

    public Bunny(int length, int theHeight) {
        length = this.length;
        this.height = theHeight;
        this.color = "white";
    }

    public static void main(String[] args) {
        // Bunny b = new Bunny("Соросинкяво");
        Bunny b = new Bunny(1, 2);
        System.out.println(b.length + " " + b.height + " " + b.color);
    }
}
