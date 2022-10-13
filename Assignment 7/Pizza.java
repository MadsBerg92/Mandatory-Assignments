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

    public String setName(String name) {
        return name;

    }
    @Override
    public display(){
        System.out.println(name + );
    }
}
