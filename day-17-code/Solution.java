import java.util.*;
import java.io.*;

public class Solution {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Get the number and the power
    System.out.print("Enter the number: ");
    int number = s.nextInt();

    System.out.print("Enter the power: ");
    int power = s.nextInt();

    try {
      System.out.println(Calculator.power(number, power));
    } catch(Calculator.InvalidArgumentError e) {
      System.out.println(e.getMessage());
    }

  }

}
