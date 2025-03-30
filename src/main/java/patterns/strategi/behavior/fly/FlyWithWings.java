package patterns.strategi.behavior.fly;

public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Качка може літати!");
    }
}
