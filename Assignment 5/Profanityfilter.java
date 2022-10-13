import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class Profanityfilter {
    public static void main(String[] args) {

        String profFilterWord = "*&#$%";
        Scanner input = new Scanner(System.in);

        String input1 = input.nextLine();
        String input2 = input.nextLine();

        String input1lowerCase = input1.toLowerCase();
        String input2CleanedUp = input2.replaceAll("[,.!?]*", "");

        String[] swearwordArray = input1lowerCase.split(" ");
        String[] input2Array = input2CleanedUp.split(" ");

        ArrayList<String> swearwordList = convertArray(swearwordArray);
        ArrayList<WordPair> wordPairList = new ArrayList<>();

        for (String word : input2Array) {
            String lowerCasedWord = word.toLowerCase();
            if (swearwordList.contains(lowerCasedWord)) {
                String filteredWord = applyFilter(word, profFilterWord);
                WordPair wp = new WordPair(word, filteredWord);
                wordPairList.add(wp);
            }
        }

        String temp = input2;

        for (WordPair wp : wordPairList) {
            temp = temp.replaceFirst(Pattern.quote(wp.getOriginal()), Matcher.quoteReplacement(wp.getFilter()));
        }

        System.out.println(temp);

    }

    public static ArrayList<String> convertArray(String[] input) {

        ArrayList<String> response = new ArrayList<>();
        for (String word : input) {
            response.add(word);
        }
        return response;

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
