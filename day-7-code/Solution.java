import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// Get the number of elements to input
		System.out.print("Enter the number of elements to insert: ");
		int n = s.nextInt();

		// Initialize the array
		int[] a = new int[n];

		// Populate the array
		int index;
		int aLength = a.length;

		for (index = 0; index < aLength; index += 1) {
			System.out.print("Enter element #" + (index + 1) + ": ");
			a[index] = s.nextInt();
		}

		for (index = aLength - 1; index >= 0; index -= 1) {
			System.out.print(a[index] + (index == 0 ? "\n" : " "));
		}

	}

}