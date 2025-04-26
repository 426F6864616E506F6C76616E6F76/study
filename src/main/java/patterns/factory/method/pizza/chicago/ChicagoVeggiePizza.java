package patterns.factory.method.pizza.chicago;

import patterns.factory.method.pizza.Pizza;

public class ChicagoVeggiePizza extends Pizza {
    public ChicagoVeggiePizza() {
        name = "Chicago Style Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushrooms");
    }
}
