import java.util.ArrayList;
import java.util.List;

public class Pizza extends Food {

    protected List<String> toppings;

    public Pizza() {
        super("Pizza", 45);
        toppings = new ArrayList<String>();

    }

    public void addTopping(String topping) {

        toppings.add(topping);
        price = price + 10;

    }

    @Override
    public void display() {
        System.out.print(price + " kr " + name + " { ");
        List<String> listPrint = toppings;
        String seperator = "";
        for (String string : listPrint) {
            System.out.print(seperator);
            System.out.print(string);
            seperator = ", ";

        }
        System.out.println(" }");
    }

    public void setName(String name) {
        this.name = name;
    }
}
