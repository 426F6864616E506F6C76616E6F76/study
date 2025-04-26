package patterns.factory.method.pizza.chicago;

import patterns.factory.method.pizza.Pizza;

public class ChicagoClamPizza extends Pizza {
    public ChicagoClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Sliced Clams");
    }
}
