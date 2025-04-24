package patterns.factory.complex.ny;

import patterns.factory.complex.Pizza;

public class NYVeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing NY Veggie Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking NY Veggie Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting NY Veggie Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing NY Veggie Pizza");
    }
}
