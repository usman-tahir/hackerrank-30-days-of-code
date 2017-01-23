import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int n = s.nextInt();
		int current = 1;
		int counter = 0;

		while (counter < 10) {
			System.out.println(n + " x " + current + " = " + (n * current) + "");
			counter += 1;
			current += 1;
		}

	}

}