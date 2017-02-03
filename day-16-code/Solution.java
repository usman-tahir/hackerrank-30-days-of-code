import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String input = s.next();

    try {
      int parsed = Integer.parseInt(input);
      System.out.println(parsed);
    } catch (Exception e) {
      System.out.println("Bad String.");
    }
  }
}
