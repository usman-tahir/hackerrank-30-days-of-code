import java.io.*;
import java.util.*;

public class Solution {

  static int[] generateBoundedArray(int ceiling) {
    int[] boundedArray = new int[ceiling];
    int index;
    for (index = 0; index < ceiling; index += 1) {
      boundedArray[index] = index + 1;
    }
    return boundedArray;
  }

  static int computeBitwiseResult(int[] boundedArray, int k) {
    int result = 0;
    int len = boundedArray.length;
    int i, j;

    for (i = 0; i < len; i += 1) {
      for (j = 0; j < len; j += 1) {
        System.out.print("A = " + boundedArray[i]
          + ", B = " + boundedArray[j]);
        System.out.println(" A & B = " + (boundedArray[i] & boundedArray[j]));
        if (boundedArray[j] > boundedArray[i]) {
          int bitwise = boundedArray[i] & boundedArray[j];
          if (bitwise < k && bitwise >= result) {
            result = bitwise;
          }
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Get the number of test cases
    System.out.print("Enter the number of test cases: ");
    int testCases = s.nextInt();

    int result = -1;
    int index;

    for (index = 0; index < testCases; index += 1) {
      // Get the upper bound for the array to generate
      System.out.print("Enter a value for 'N': ");
      int n = s.nextInt();

      // Get the other comparison integer, K
      System.out.print("Enter a value for 'K': ");
      int k = s.nextInt();

      int[] boundedArray = generateBoundedArray(n);
      result = computeBitwiseResult(boundedArray, k);
      System.out.println(result);
    }

  }

}
