package patterns.factory.method.store;

import patterns.factory.method.pizza.chicago.ChicagoCheesePizza;
import patterns.factory.method.pizza.chicago.ChicagoClamPizza;
import patterns.factory.method.pizza.chicago.ChicagoPepperoniPizza;
import patterns.factory.method.pizza.chicago.ChicagoVeggiePizza;
import patterns.factory.method.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        if (item.equals("cheese")) {
            pizza = new ChicagoCheesePizza();
        }else if (item.equals("pepperoni")) {
            pizza = new ChicagoPepperoniPizza();
        }else if (item.equals("clam")) {
            pizza = new ChicagoClamPizza();
        }else if (item.equals("veggie")) {
            pizza = new ChicagoVeggiePizza();
        }
        return pizza;
    }
}
