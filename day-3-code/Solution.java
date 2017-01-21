import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static String interpretNumber(int number) {
		String result = "";
		boolean isEven = (number % 2 == 0);

		if (!isEven) {
			result = "Weird";
		} else if ((isEven) && (number >= 2 && number <= 5)) {
			result = "Not Weird";
		} else if ((isEven) && (number >= 6 && number <= 20)) {
			result = "Weird";
		} else if ((isEven) && (number > 20)) {
			result = "Not Weird";
		}
		return result;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int number;

		// Get the number from the user
		System.out.print("Enter a number: ");
		number = s.nextInt();
		System.out.println(interpretNumber(number));
	}

}