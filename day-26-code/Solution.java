import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static int computeLibraryFine(int[] returned, int[] expected) {
    int returnedDay = returned[0], returnedMonth = returned[1], returnedYear = returned[2];
    int expectedDay = expected[0], expectedMonth = expected[1], expectedYear = expected[2];
    int fine = 0;

    if (returnedYear == expectedYear) {
      if (returnedMonth < expectedMonth || (returnedMonth == expectedMonth && returnedDay <= expectedDay)) {
        fine = 0;
      } else if (returnedMonth == expectedMonth) {
        fine = (returnedDay - expectedDay) * 15;
      } else if (returnedMonth > expectedMonth) {
        fine = (returnedMonth - expectedMonth) * 500;
      }
    } else if (returnedYear > expectedYear) {
      fine = 10000;
    }
    return fine;
  }

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    String[] suffixes = {"day", "month", "year"};

    // Get the date that the book was actually returned
    int[] returned = new int[3];
    int i;

    for (i = 0; i < 3; i += 1) {
      System.out.print("Enter the " + suffixes[i] + " this book was returned: ");
      returned[i] = s.nextInt();
    }

    // Get the date that the book was supposed to be returned
    int[] expected = new int[3];
    for (i = 0; i < 3; i += 1) {
      System.out.print("Enter the " + suffixes[i] + " this book was expected: ");
      expected[i] = s.nextInt();
    }

    System.out.println(computeLibraryFine(returned, expected));
  }

}
