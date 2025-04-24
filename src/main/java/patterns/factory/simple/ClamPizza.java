package patterns.factory.simple;

public class ClamPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Prepare Clam Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Bake Clam Pizza");
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
