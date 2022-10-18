public class Main {
    public static void main(String[] args) {

        Food burger = new Food("Burger", 65);
        Food coke = new Food("Coke", 25);
        Pizza pizza = new Pizza();
        pizza.addTopping("cheese");
        pizza.addTopping("fish");
        pizza.addTopping("olives");
        pizza.display();
        Order order = new Order();
        order.addFood(coke);
        order.addFood(burger);
        order.addFood(pizza);
        order.display();

    }

}
