import java.util.*;

public class Solution {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Enter the number of elements: ");
    int n = s.nextInt();

    int[] a = new int[n];
    int i;

    for (i = 0; i < n; i += 1) {
      System.out.print("Please enter element #" + (i + 1) + ": ");
      a[i] = s.nextInt();
    }

    s.close();

    Difference d = new Difference(a);
    d.computeDifference();
    System.out.println(d.maximumDifference);
  }

}