package patterns.factory.abstracts;

import patterns.factory.abstracts.store.NYPizzaStore;
import patterns.factory.abstracts.store.PizzaStore;
import patterns.factory.method.store.ChicagoPizzaStore;

public class Main {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
