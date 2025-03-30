package patterns.strategi;

import patterns.strategi.behavior.fly.FlyWithWings;
import patterns.strategi.behavior.quack.MuteQuack;
import patterns.strategi.birds.DecoyDuck;
import patterns.strategi.birds.Duck;
import patterns.strategi.birds.MallardDuck;
import patterns.strategi.birds.ModelDuck;

public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck decoyDuck = new DecoyDuck();
        System.out.println("---------------------------------------------");
        mallardDuck.performFly();
        mallardDuck.performQuack();
        System.out.println("---------------------------------------------");
        decoyDuck.performFly();
        decoyDuck.performQuack();
        System.out.println("---------------------------------------------");
        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
