package patterns.factory.complex.ny;

import patterns.factory.complex.Pizza;

public class NYcheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing NY Cheese Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking NY Cheese Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting NY Cheese Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing NY Cheese Pizza");
    }
}
