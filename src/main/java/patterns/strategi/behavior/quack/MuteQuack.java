package patterns.strategi.behavior.quack;

import patterns.strategi.behavior.quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Качка не крякає!!!");
    }
}
