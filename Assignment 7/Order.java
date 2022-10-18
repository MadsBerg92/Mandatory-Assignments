import java.util.ArrayList;
import java.util.List;

public class Order implements CreditCard {

    protected List<Food> ordered;

    public Order() {

        ordered = new ArrayList<Food>();

    }

    public void addFood(Food food) {
        ordered.add(food);
    }

    public int total() {
        int amountTotal = 0;
        for (Food food : ordered) {
            amountTotal += food.getPrice();

        }
        return amountTotal;

    }

    public void display() {
        for (Food food : ordered) {
            food.display();
            // System.out.println();
        }
        System.out.println(total() + " kr TOTAL");

    }

    public boolean payWith(CreditCard card) {

        if (!card.withdraw(total())) {
            System.out.println("ERROR: Payment failed");
        }

        return card.withdraw(total());

    }

    @Override
    public boolean withdraw(int amount) {

        return false;
    }

}
