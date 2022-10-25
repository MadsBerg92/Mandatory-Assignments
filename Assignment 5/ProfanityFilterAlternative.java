import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ProfanityFilterAlternative {

    private static Set<String> swearWords;
    private static char[] bleep;
    private static Set<String> punctuation;

    public static void main(String[] args) {
        punctuation = new HashSet<>();
        punctuation.add(",");
        punctuation.add(".");
        punctuation.add("!");
        punctuation.add("?");

        bleep = new char[] { '*', '&', '#', '$', '%' };

        Scanner sc = new Scanner(System.in);
        String inputFilter = sc.nextLine();
        String[] swearWordsArr = inputFilter.toLowerCase().split(" ");
        swearWords = new HashSet<>();
        for (String swearWord : swearWordsArr) {
            swearWords.add(swearWord);
        }

        while (sc.hasNext()) {
            String inputLine = sc.nextLine();
            String[] inputSplit = inputLine.split(" ");
            if (inputLine.isEmpty())
                continue;
            String outputLine = "";
            for (String word : inputSplit) {
                char lastChar = word.charAt(word.length() - 1);
                String wordTrimmed = word.substring(0, word.length());
                if (punctuation.contains(lastChar)) {
                    outputLine += filter(wordTrimmed) + lastChar + " ";

                } else {
                    outputLine += filter(word) + " ";
                }

            }
            System.out.println(outputLine);
        }
        sc.close();

    }

    private static String filter(String word) {
        if (swearWords.contains(word.toLowerCase())) {
            String filterWord = "";
            for (int i = 0; i < word.length(); i++) {
                filterWord += bleep[i % (bleep.length)];

            }
            return filterWord;
        }
        return word;
    }

}



