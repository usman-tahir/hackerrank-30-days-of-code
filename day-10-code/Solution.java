import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static String convertDecimalToBinary(int n) {
    String result = ((n % 2 == 0) ? "0" : "1");
    if (n == 0 || n == 1) {
      return result;
    }
    return convertDecimalToBinary(n / 2) + result;
  }

  static String generatePattern(int repetition, String pattern) {
    String result = "";
    int index;
    for (index = 0; index < repetition; index += 1) {
      result += pattern;
    }
    return result;
  }

  static int determineMaxConsecutiveOnes(String convertedNumber) {
    int maxLength = convertedNumber.length();
    int index;
    for (index = maxLength; index > 0; index -= 1) {
      String currentPattern = generatePattern(index, "1");
      if (convertedNumber.indexOf(currentPattern) >= 0) {
        return index;
      }
    }
    return 0;
  }

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

    // Get the number from the user
    System.out.print("Enter the number to convert: ");
    int n = s.nextInt();

    String converted = convertDecimalToBinary(n);

    System.out.println(determineMaxConsecutiveOnes(converted));

	}

}