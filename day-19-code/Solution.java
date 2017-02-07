import java.io.*;
import java.util.*;

public class Solution {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Ask for the number to parse
    System.out.print("Enter a number: ");
    int n = s.nextInt();

    s.close();

    AdvancedArithmetic myCalculator = new Calculator();
    int sum = myCalculator.divisorSum(n);
    System.out.println("I implemented "
      + myCalculator.getClass().getInterfaces()[0].getName());
    System.out.println(sum);
  }

}
