import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static String parseString(String input) {
		String[] letters = input.split("");
		String evenLetters = "", oddLetters = "";
		int i;

		// Set the even letters
		for (i = 0; i < input.length(); i += 2) {
			evenLetters += letters[i];
		}

		// Set the odd letters
		for (i = 1; i < input.length(); i += 2) {
			oddLetters += letters[i];
		}

		return evenLetters + " " + oddLetters;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// Get the number of test cases
		System.out.print("Enter the number of test cases: ");
		int testCases = s.nextInt();
		String[] words = new String[testCases];

		int index;

		System.out.println("Enter each word, then press enter: ");
		for (index = 0; index < testCases; index += 1) {
			words[index] = s.next();
		}

		for (String word : words) {
			System.out.println(parseString(word));
		}

	}

}