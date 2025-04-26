package patterns.factory.method.pizza.ny;

import patterns.factory.method.pizza.Pizza;

public class NYcheesePizza extends Pizza {
    public NYcheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
