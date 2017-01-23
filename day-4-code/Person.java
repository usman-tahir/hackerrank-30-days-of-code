import java.io.*;
import java.util.*;

public class Person {

	private int age;

	public Person(int initialAge) {
		if (initialAge < 0) {
			System.out.println("Age is not valid, setting age to 0.");
			this.age = 0;
		} else {
			this.age = initialAge;
		}
	}

	public void amIOld() {
		if (this.age < 13) {
			System.out.println("You are young.");
		} else if (this.age >= 13 && this.age < 18) {
			System.out.println("You are a teenager.");
		} else {
			System.out.println("You are old.");
		}
	}

	public void yearPasses() {
		this.age += 1;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the number of test cases: ");
		int numberOfTestCases = s.nextInt();

		int index;
		for (index = 0; index < numberOfTestCases; index += 1) {
			System.out.print("Enter the age of this person: ");
			int age = s.nextInt();
			
			Person p = new Person(age);
			p.amIOld();

			int j;
			for (j = 0; j < 3; j += 1) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		s.close();
	}

}