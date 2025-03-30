package patterns.strategi.birds;

import patterns.strategi.behavior.fly.FlyWithWings;
import patterns.strategi.behavior.quack.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
