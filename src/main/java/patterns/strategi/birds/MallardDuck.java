package patterns.strategi.birds;

import patterns.strategi.behavior.fly.FlyWithWings;
import patterns.strategi.behavior.quack.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
