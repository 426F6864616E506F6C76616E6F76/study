package patterns.strategi.birds;

import patterns.strategi.behavior.fly.FlyNoWay;
import patterns.strategi.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
}
