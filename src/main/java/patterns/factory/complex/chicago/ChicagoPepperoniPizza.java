package patterns.factory.complex.chicago;

import patterns.factory.complex.Pizza;

public class ChicagoPepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Chicago Pepperoni Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Chicago Pepperoni Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut Chicago Pepperoni Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Chicago Pepperoni Pizza");
    }
}
