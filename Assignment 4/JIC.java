public class JIC {

import java.util.Map;
import java.util.TreeMap;

public class DrinkingSongGenerator {

    private int number;
    private String container;
    private String drink;

    DrinkingSongGenerator(int n, String c, String d) {

        number = n;
        container = c;
        drink = d;
        Map<Integer, String> numbersMap = new TreeMap<Integer, String>();

        numbersMap.put(1, "One");
        String songLyric = new String();

        while (number != 0) {
            if (number == 1) {
                String p = numbersMap.get(1);

                container = container.replace("s", "");

                songLyric = songLyric + p + " " + container + " of " + drink + " on the wall";
                songLyric = songLyric + p + " " + container + " of " + drink;
                System.out.println("Take one down, pass it around");
                number = number - 1;
            } else {
                System.out.println(number + " " + container + " of " + drink + " on the wall");
                System.out.println(number + " " + container + " of " + drink);
                System.out.println("Take one down, pass it around");
                number = number - 1;
                System.out.println(number + " " + container + " of " + drink + " on the wall");
                System.out.println();
                if (number - 1 < 2) {
                    String q = numbersMap.get(1);
                    System.out.println(number + " " + container + " of " + drink + " on the wall");
                    System.out.println(number + " " + container + " of " + drink);
                    System.out.println("Take one down, pass it around");
                    number = number - 1;
                    container = container.replace("s", "");
                    System.out.println(q + " " + container + " of " + drink + " on the wall");
                    System.out.println();
                } else if (number - 1 == 1) {
                    number = number - 1;
                    String q = numbersMap.get(1);
                    System.out.println(q + " " + container + " of " + drink + " on the wall");
                    System.out.println();

                }

            }
        }
        if (number == 0) {
            System.out.println("No more " + container + "s " + "of " + drink + " on the wall");
            return;

        }

        return songLyric;

    }
}

}
