package patterns.factory.complex.store;

import patterns.factory.complex.chicago.ChicagoCheesePizza;
import patterns.factory.complex.chicago.ChicagoClamPizza;
import patterns.factory.complex.chicago.ChicagoPepperoniPizza;
import patterns.factory.complex.chicago.ChicagoVeggiePizza;
import patterns.factory.complex.Pizza;

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
