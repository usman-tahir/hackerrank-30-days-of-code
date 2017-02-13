import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static String isPrime(int n) {
    int divisors = 0;
    int i;

    if (n == 0 || n == 1) {
      return "Not prime";
    }

    for (i = 2; (i * i) <= n; i += 1) {
      if (n % i == 0) {
        return "Not prime";
      }
    }
    return "Prime";
  }

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Enter the number of test cases: ");
    int testCases = s.nextInt();

    int index;
    for (index = 0; index < testCases; index += 1) {
      System.out.print("Enter a number: ");
      int number = s.nextInt();
      System.out.println(isPrime(number));
    }

  }

}
