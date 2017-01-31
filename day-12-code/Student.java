
class Student extends Person {

	private int[] testScores;

	Student(String firstName, String lastName, int idNumber, int[] testScores) {
		super(firstName, lastName, idNumber);
		this.testScores = testScores;
	}

	public char calculate() {
		char result = 'U';

		// Calculate the average score
		int grades = this.testScores.length;
		double grade = 0.00;
		int index;

		for (int g : this.testScores) {
			grade += g;
		}

		grade /= grades;

		if (grade <= 100 && grade >= 90) {
			result = 'O';
		} else if (grade >= 80 && grade < 90) {
			result = 'E';
		} else if (grade >= 70 && grade < 80) {
			result = 'A';
		} else if (grade >= 55 && grade < 70) {
			result = 'P';
		} else if (grade >= 40 && grade < 55) {
			result = 'D';
		} else {
			result = 'T';
		}

		return result;
	}

}