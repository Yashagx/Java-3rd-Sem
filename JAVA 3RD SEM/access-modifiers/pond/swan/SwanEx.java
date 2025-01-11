package pond.swan;

import pond.shore.Bird;

public class SwanEx extends Bird {
    
    public void swim() {
        floatInWater();
        System.out.println(text);
    }

    public void helpOtherSwanExToSwim() {
        SwanEx sw = new SwanEx();
        sw.floatInWater();
        System.out.println(text);
    }
    
    public void helpOtherBirdToSwim() {
        Bird b = new Bird();
        b.floatInWater();
        System.out.println(b.text);
    }
}
