package pond.swan;

import pond.duck.*;

public class BadCygnet{
    public void makeNoise(){
        MotherDuck duck = new MotherDuck();
        duck.quack();
        System.out.println(duck.noise);
    }
}
