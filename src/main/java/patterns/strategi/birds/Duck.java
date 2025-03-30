package patterns.strategi.birds;

import patterns.strategi.behavior.fly.FlyBehavior;
import patterns.strategi.behavior.quack.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
