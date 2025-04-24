package patterns.factory.complex.store;

import patterns.factory.complex.ny.NYVeggiePizza;
import patterns.factory.complex.ny.NYcheesePizza;
import patterns.factory.complex.ny.NYclamPizza;
import patterns.factory.complex.ny.NYpepperoniPizza;
import patterns.factory.complex.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        if (item.equals("cheese")) {
            pizza = new NYcheesePizza();
        }else if (item.equals("pepperoni")) {
            pizza = new NYpepperoniPizza();
        }else if (item.equals("clam")) {
            pizza = new NYclamPizza();
        }else if (item.equals("veggie")) {
            pizza = new NYVeggiePizza();
        }
        return pizza;
    }
}
