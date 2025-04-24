package patterns.factory.complex;

import patterns.factory.complex.store.ChicagoPizzaStore;
import patterns.factory.complex.store.NYPizzaStore;

public class Main {
    public static void main(String[] args) {
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        System.out.println("*** New Order Pizza ***");
        System.out.println("\nChicago Cheese ordered Pizza");
        chicagoPizzaStore.orderPizza("cheese");
        System.out.println("\nChicago Calm ordered Pizza");
        chicagoPizzaStore.orderPizza("clam");
        System.out.println("\nChicago Veggie ordered Pizza");
        chicagoPizzaStore.orderPizza("veggie");
        System.out.println("\nChicago Pepperoni ordered Pizza");
        chicagoPizzaStore.orderPizza("pepperoni");
        System.out.println("*** End Order Pizza ***");

        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        System.out.println("*** New Order Pizza ***");
        System.out.println("\nChicago Cheese ordered Pizza");
        nyPizzaStore.orderPizza("cheese");
        System.out.println("\nChicago Calm ordered Pizza");
        nyPizzaStore.orderPizza("clam");
        System.out.println("\nChicago Veggie ordered Pizza");
        nyPizzaStore.orderPizza("veggie");
        System.out.println("\nChicago Pepperoni ordered Pizza");
        nyPizzaStore.orderPizza("pepperoni");
        System.out.println("*** End Order Pizza ***");
    }
}
