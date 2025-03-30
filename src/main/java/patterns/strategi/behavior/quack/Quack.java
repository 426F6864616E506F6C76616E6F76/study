package patterns.strategi.behavior.quack;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("Качка робить кряк!!!");
    }
}
