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

    }

    public String toString() {

        String songLyric = new String();
        while (number != 0) {

            Map<Integer, String> numbersMap = new TreeMap<Integer, String>();
            numbersMap.put(1, "One");
            if (number == 1) {
                String p = numbersMap.get(1);

                container = container.replace("s", "");

                songLyric = songLyric + p + " " + container + " of " + drink + " on the wall\n";
                songLyric = songLyric + p + " " + container + " of " + drink + "\n";
                songLyric = songLyric + "Take one down, pass it around\n";
                number = number - 1;
            } else {
                songLyric = songLyric + number + " " + container + " of " + drink + " on the wall\n";
                songLyric = songLyric + number + " " + container + " of " + drink + "\n";
                songLyric = songLyric + "Take one down, pass it around\n";
                number = number - 1;
                songLyric = songLyric + number + " " + container + " of " + drink + " on the wall\n";
                songLyric = songLyric + "\n";
                if (number - 1 < 2) {
                    String q = numbersMap.get(1);
                    songLyric = songLyric + number + " " + container + " of " + drink + " on the wall\n";
                    songLyric = songLyric + number + " " + container + " of " + drink + "\n";
                    songLyric = songLyric + "Take one down, pass it around\n";
                    number = number - 1;
                    container = container.replace("s", "");
                    songLyric = songLyric + q + " " + container + " of " + drink + " on the wall\n";
                    songLyric = songLyric + "\n";
                } else if (number - 1 == 1) {
                    number = number - 1;
                    String q = numbersMap.get(1);
                    songLyric = songLyric + q + " " + container + " of " + drink + " on the wall\n";
                    songLyric = songLyric + "\n";

                }

            }
        }
        if (number == 0) {
            songLyric = songLyric + "No more " + container + "s " + "of " + drink + " on the wall";

        }

        return songLyric;

    }
}
