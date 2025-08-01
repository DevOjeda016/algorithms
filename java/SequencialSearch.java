public class SequencialSearch {
  public static void main(String[] args) {
    var elementToFind = 5;

    try {
      var result = sequencialSearch(elementToFind, 3, 1, 4, 2, 5);

      var out = result != -1
          ? String.format("Element %d was found in the index %d", elementToFind, result)
          : "Element was not found";
      System.out.println(out);
    } catch (NullPointerException e) {
      System.out.println(e.getMessage());
    }

  }

  private static int sequencialSearch(int element, int... arr) {

    for (var i = 0; i < arr.length; i++) {
      if (arr[i] == element) {
        return i;
      }
    }
    return -1;
  }
}