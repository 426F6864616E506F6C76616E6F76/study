package patterns.factory.method;

import patterns.factory.method.pizza.Pizza;
import patterns.factory.method.store.ChicagoPizzaStore;
import patterns.factory.method.store.NYPizzaStore;
import patterns.factory.method.store.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        System.out.println("*** New York Store ***");
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());

        System.out.println("*** Chicago Store ***");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
