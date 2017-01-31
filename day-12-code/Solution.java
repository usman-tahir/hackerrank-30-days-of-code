import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstName = scan.next();

		System.out.print("Enter your last name: ");
		String lastName = scan.next();

		System.out.print("Enter your ID: ");
		int id = scan.nextInt();

		System.out.print("Enter the number of scores you received: ");
		int numScores = scan.nextInt();


		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i += 1){
			System.out.print("Enter score #" + (i + 1) + ": ");
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		System.out.println();
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}

}