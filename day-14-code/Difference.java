import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Difference {

  private int[] elements;
  public int maximumDifference;

  Difference(int[] elements) {
    this.elements = elements;
  }

  void computeDifference() {
    int computedDifference = 0;
    int length = this.elements.length;
    int i;

    for (i = 0; i < length; i += 1) {
      for (int j : this.elements) {
        // System.out.println(this.elements[i] + " - " + j + " = " + Math.abs(this.elements[i] - j));
        if (Math.abs(this.elements[i] - j) >= computedDifference) {
          computedDifference = Math.abs(this.elements[i] - j);
        }
      }
    }

    this.maximumDifference = computedDifference;
  }

}