package patterns.factory.method.store;

import patterns.factory.method.pizza.ny.NYVeggiePizza;
import patterns.factory.method.pizza.ny.NYcheesePizza;
import patterns.factory.method.pizza.ny.NYclamPizza;
import patterns.factory.method.pizza.ny.NYpepperoniPizza;
import patterns.factory.method.pizza.Pizza;

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
