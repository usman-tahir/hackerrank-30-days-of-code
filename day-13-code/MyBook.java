
class MyBook extends Book {

	protected int price;

	MyBook(String title, String author, int price) {
		super(title, author);
		this.price = price;
	}

	void display() {
		System.out.println("Title: " + this.title + "\nAuthor: " + this.author + "\nPrice: " + this.price);
	}

}