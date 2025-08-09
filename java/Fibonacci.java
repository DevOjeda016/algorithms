import java.util.Arrays;

public class Fibonacci {
  public static void main(String[] args) {
    var sequence = getFibonacci(20);
    Arrays
      .stream(sequence)
      .forEach(e -> System.out.print(e + " "));
  }

  private static int[] getFibonacci(int n) {
    if (n == 0) return new int[]{};
    if (n == 1) return new int[]{0};
    
    var sequence = new int[n];
    sequence[0] = 0;
    sequence[1] = 1;

    for (var i = 2; i < sequence.length; i++) {
      sequence[i] = sequence[i - 1] + sequence[i - 2];
    }
    return sequence;
  }
}