package patterns.factory.method.pizza.chicago;

import patterns.factory.method.pizza.Pizza;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        name = "Chicago Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
