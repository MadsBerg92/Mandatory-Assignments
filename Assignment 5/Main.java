import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String profFilterWord = "*&#$%";
        Scanner scanner = new Scanner(System.in);

        String inputSwearWordText = scanner.nextLine();
        List<String> allWordsList = scanner.tokens().collect(Collectors.toList());
        String inputText = String.join(" ", allWordsList);
        String outputText = inputText;

        String inputSwearWordTextLowerCase = inputSwearWordText.toLowerCase();
        String inputTextCleanedUp = inputText.replaceAll("[,.!?]*", "");

        String[] swearwordArray = inputSwearWordTextLowerCase.split(" ");
        String[] inputTextArray = inputTextCleanedUp.split(" ");

        ArrayList<String> swearwordList = convertArray(swearwordArray);
        ArrayList<WordPair> wordPairList = new ArrayList<>();

        for (String word : inputTextArray) {
            String lowerCasedWord = word.toLowerCase();
            if (swearwordList.contains(lowerCasedWord)) {
                String filteredWord = applyFilter(word, profFilterWord);
                WordPair wp = new WordPair(word, filteredWord);
                wordPairList.add(wp);
            }
        }

        for (WordPair wp : wordPairList) {
            outputText = outputText.replaceAll("\\b" + Pattern.quote(wp.getOriginal()) + "\\b",
                    Matcher.quoteReplacement(wp.getFilter()));
        }
        System.out.println(outputText);

    }

    public static ArrayList<String> convertArray(String[] input) {
        return new ArrayList<>(Arrays.asList(input));
    }

    public static String applyFilter(String input, String filter) {
        if (input.length() <= filter.length()) {
            return filter.substring(0, input.length());
        } else {
            int div = input.length() / filter.length();
            int remainder = input.length() % filter.length();
            String divFilter = filter.repeat(div);
            String remainderFilter = filter.substring(0, remainder);
            return divFilter + remainderFilter;
        }
    }
}