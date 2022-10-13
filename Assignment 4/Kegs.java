public class Kegs {

    int number;
    String container;
    String drink;

    public Kegs(int n, String c, String d) {

        number = n;
        container = c;
        drink = d;

        while (number < 100) {
            if (number == 1) {
                container = container.replace("s", "");
            }
            System.out.println(number + " " + container + " of " + drink + " on the wall");
            System.out.println(number + " " + container + " of " + drink);
            System.out.println("Take one down, pass it around");
            number = number - 1;
            System.out.println(number + " " + container + " of " + drink + " on the wall");
            // if (number > 0) {
            // System.out.println(number + " " + container + " of " + drink + " on the
            // wall");

            if (number == 0) {
                System.out.println("No more " + container + "s " + "of " + drink + " on the wall");
                return;
            }
        }

    }

}
