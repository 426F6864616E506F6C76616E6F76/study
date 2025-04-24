package patterns.factory.complex.chicago;

import patterns.factory.complex.Pizza;

public class ChicagoCheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Chicago Cheese Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Chicago Cheese Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting Chicago Cheese Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Chicago Cheese Pizza");
    }
}
