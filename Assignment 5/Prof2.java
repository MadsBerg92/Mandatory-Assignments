import java.util.Scanner;
import java.util.regex.Matcher;

public class Prof2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] profWords = scan.nextLine().split("\\s");

        String filter = "*&#$%".repeat(5);
        while (scan.hasNext()) {

            String input = scan.nextLine();
            for (String profWord : profWords)

                input = input.replaceAll("(=i)\\b" + profWord + "\\b",
                        Matcher.quoteReplacement(filter.substring(0, profWord.length())));

            System.out.println(input);

        }

    }

}
