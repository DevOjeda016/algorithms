import java.util.ArrayList;
import java.util.List;

public class FindSubstring {
  public static void main(String[] args) {
    var string = "DevHello Dev!";
    var substring = "Dev";
    var results = findSubstring(string, substring);
    System.out.print("Occurences found in " + results);
  }

  private static List<Integer> findSubstring(String string, String substring) {
    var n = string.length();
    var m = substring.length();
    var occurences = new ArrayList<Integer>();

    for (var i = 0; i <= n - m; i++) {
      var j = 0;
      while (j < m) {
        if (string.charAt(i + j) != substring.charAt(j)) {
          break;
        }
        j += 1;
      }
      if (j == m) {
        occurences.add(i);
      }
    }
    return occurences;
  }
}