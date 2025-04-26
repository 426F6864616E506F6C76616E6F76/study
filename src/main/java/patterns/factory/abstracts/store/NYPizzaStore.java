package patterns.factory.abstracts.store;

import patterns.factory.abstracts.factory.NYPizzaIngredientFactory;
import patterns.factory.abstracts.factory.PizzaIngredientFactory;
import patterns.factory.abstracts.pizza.CheesePizza;
import patterns.factory.abstracts.pizza.Pizza;


public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if (item.equals("pepperoni")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }else if (item.equals("clam")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }else if (item.equals("veggie")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        return pizza;
    }
}
