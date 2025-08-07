import java.util.HashMap;
import java.util.Map;

public class CountWords {
  public static void main(String[] args) {
    var text = "Hello Devs, Today I going to talk about my experience as a programmer. I started as a dev 5 year ago";
    var tokens = tokenizeWords(text);
    var countedWords = countWords(tokens);
    displayTable(countedWords);
  }

  private static String[] tokenizeWords(String text) {
    return text.split(" ");
  }

  private static Map<String, Integer> countWords(String[] tokens) {
    var countedWords = new HashMap<String, Integer>();

    for (var token : tokens) {
      countedWords.put(
          token,
          countedWords.getOrDefault(token, 0) + 1);
    }
    return countedWords;
  }

  private static void displayTable(Map<String, Integer> countedWords) {
    var outFormat = "%-20s%20s%n";
    System.out.printf(outFormat, "Word", "Frequency");
    countedWords.forEach((k, v) -> System.out.printf(outFormat, k, String.valueOf(v)));
  }
}