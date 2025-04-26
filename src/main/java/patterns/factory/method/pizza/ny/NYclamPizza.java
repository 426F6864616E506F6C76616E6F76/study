package patterns.factory.method.pizza.ny;

import patterns.factory.method.pizza.Pizza;

public class NYclamPizza extends Pizza {
    public NYclamPizza() {
        name = "NY Style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
