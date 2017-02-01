import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter a title for this book: ");
		String title = s.nextLine();

		System.out.print("Enter an author for this book: ");
		String author = s.nextLine();

		System.out.print("Enter the price for this book (pennies): ");
		int price = s.nextInt();

		Book newBook = new MyBook(title, author, price);
		newBook.display();

	}

}