import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    var n = sc.nextInt();
    sc.close();

    var result = factorial(n);
    System.out.printf("Factorial of %d is %d", n, result);
  }

  private static int factorial(int n) {
    var result = 1;
    for (var i = 1; i <= 5; i++) {
      result *= i;
    }
    return result;
  }
}