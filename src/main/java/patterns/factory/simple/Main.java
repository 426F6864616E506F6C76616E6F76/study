package patterns.factory.simple;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        System.out.println("*** New Order Pizza ***");
        System.out.println("\nCheese ordered Pizza");
        pizzaStore.orderPizza("cheese");
        System.out.println("\nVeggie ordered Pizza");
        pizzaStore.orderPizza("veggie");
        System.out.println("\nClam ordered Pizza");
        pizzaStore.orderPizza("clam");
        System.out.println("\nPepperoni ordered Pizza");
        pizzaStore.orderPizza("pepperoni");
        System.out.println("*** End Order Pizza ***");
    }
}
