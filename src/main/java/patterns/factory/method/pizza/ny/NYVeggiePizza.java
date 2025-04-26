package patterns.factory.method.pizza.ny;

import patterns.factory.method.pizza.Pizza;

public class NYVeggiePizza extends Pizza {
    public NYVeggiePizza() {
        name = "NY Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
    }
}
