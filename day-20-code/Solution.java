import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  static int bubbleSort(int[] array) {
    int numberOfSwaps = 0;
    int len = array.length;
    int i, j;

    for (i = 0; i < len; i += 1) {
      for (j = 0; j < len - 1; j += 1) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
          numberOfSwaps += 1;
        }
      }

      if (numberOfSwaps == 0) {
        break;
      }

    }

    return numberOfSwaps;
  }



  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // Get the number of elements to add
    System.out.print("Enter the number of elements to add: ");
    int n = s.nextInt();

    // Get the elements of the list
    int[] array = new int[n];
    int index;

    for (index = 0; index < n; index += 1) {
      System.out.print("Please enter element #" + (index + 1) + ": ");
      array[index] = s.nextInt();
    }

    System.out.println(bubbleSort(array));
    System.out.println(Arrays.toString(array));
  }

}
