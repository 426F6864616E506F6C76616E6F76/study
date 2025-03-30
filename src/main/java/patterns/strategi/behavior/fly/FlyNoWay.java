package patterns.strategi.behavior.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Качка не може літати!!!");
    }
}
