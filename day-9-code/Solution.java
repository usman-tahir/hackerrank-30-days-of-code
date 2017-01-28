import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// Ask the user for a number
		System.out.print("Enter a number: ");
		int n = s.nextInt();

		System.out.println(n + "! = " + factorial(n));

	}

}