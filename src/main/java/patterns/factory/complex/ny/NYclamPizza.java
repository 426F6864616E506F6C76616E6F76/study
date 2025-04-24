package patterns.factory.complex.ny;

import patterns.factory.complex.Pizza;

public class NYclamPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare NY Clam Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake NY Clam Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cut NY Clam Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing NY Clam Pizza");
    }
}
