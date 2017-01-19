import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  public static void main(String[] args) {
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";

    Scanner scan = new Scanner(System.in);

    /*
      Declare a second integer, double and String
    */
    int j;
    double e;
    String t = "";

    /*
      Read and save an integer, double, and String
    */
    j = Integer.parseInt(scan.nextLine());
    e = Double.parseDouble(scan.nextLine());
    t = scan.nextLine();

    System.out.println(i + j);
    System.out.println(d + e);
    System.out.println(s + t);

    scan.close();
  }
}