package pond.goose;

import pond.shore.Bird;

public class Goose extends Bird {
    
    public void helpGooseSwim() {
        Goose g = new Goose();
        g.floatInWater();
        System.out.println(g.text);
    }

    public void helpOtherGoosSwim() {
        Bird b = new Goose();
        b.floatInWater();
        System.out.println(b.text);
    }
}
