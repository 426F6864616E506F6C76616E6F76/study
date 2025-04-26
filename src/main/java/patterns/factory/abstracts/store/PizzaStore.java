package patterns.factory.abstracts.store;


import patterns.factory.abstracts.pizza.Pizza;

public abstract class PizzaStore {


    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String item);
}
