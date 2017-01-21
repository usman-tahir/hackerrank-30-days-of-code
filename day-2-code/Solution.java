import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// Get the meal cost
		System.out.print("Enter the cost of the meal ($): ");
		double mealCost = Double.parseDouble(s.nextLine());

		// Get the tip percent
		System.out.print("Enter the tip percentage (1 - 100): ");
		int tipPercent = Integer.parseInt(s.nextLine());

		// Get the tax percent
		System.out.print("Enter the tax percentage (1 - 100): ");
		int taxPercent = Integer.parseInt(s.nextLine());

		// Calculate the total cost of the meal
		mealCost += (mealCost * (tipPercent / 100.00)) + (mealCost * (taxPercent / 100.00));
		System.out.println("The total meal cost is " + (int)mealCost + " dollars.");

	}

}