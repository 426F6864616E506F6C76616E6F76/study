package patterns.factory.complex.chicago;

import patterns.factory.complex.Pizza;

public class ChicagoClamPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare Chicago Clam Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake Chicago Clam Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut Clam Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Clam Pizza");
    }
}
