package patterns.factory.complex.ny;

import patterns.factory.complex.Pizza;

public class NYpepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing NY Pepperoni Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking NY Pepperoni Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut NY Pepperoni Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing NY Pepperoni Pizza");
    }
}
