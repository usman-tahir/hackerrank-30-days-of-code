import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {

		HashMap<String, String> addressBook = new HashMap<String, String>();
		Scanner s = new Scanner(System.in);

		// Determine the number of entries to add
		System.out.print("Enter the number of entries to add: ");
		int n = s.nextInt();
		int index;

		for (index = 0; index < n; index += 1) {
			String name = "", number = "";

			System.out.print("Enter the name for entry #" + (index + 1) + ": ");
			name = s.next();

			System.out.print("\nEnter the number for entry #" + (index + 1) + "(9 digits): ");
			number = s.next();

			addressBook.put(name, number);

		}

		String searchedName = "";
		while (!(searchedName.equalsIgnoreCase("q"))) {
			System.out.print("Enter a name to search, or 'q' to quit: ");
			searchedName = s.next();

			if (searchedName.equalsIgnoreCase("q")) {
				break;
			}
			
			if (addressBook.get(searchedName) != null) {
				System.out.println(searchedName + ": " + addressBook.get(searchedName));
			} else {
				System.out.println("This name was not found in the address book.");
			}
		}

	}

}