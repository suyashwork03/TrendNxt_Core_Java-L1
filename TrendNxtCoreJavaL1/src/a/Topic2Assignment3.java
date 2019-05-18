package a;

class Book {
	String isbn, title;
	float price;

	public Book(String isbn, String title, float price) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}

	
	public void details() {
		System.out.println("Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]");
	}
	
	
	

}
class Magzine extends Book
{
	String type;
	public Magzine(String isbn, String title, float price, String type) {
		super(isbn, title, price);
		this.type=type;
	}
	public void display()
	{
		System.out.println("isbn=" + isbn + ", title=" + title + ", type=" + type + ", price=" + price + "");
	}

	
}
class Novel extends Book
{
	String author;
	public Novel(String isbn, String title, float price, String author) {
		super(isbn, title, price);
		this.author=author;
	}
	public void display()
	{
		System.out.println("isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + "");
	}

	
}
public class Topic2Assignment3 {
	public static void main(String ar[])
	{
		Magzine magzine=new Magzine("978-3-16-148410-0", "The avengers", 1000, "Magzine");
		Novel novel=new Novel("978-3-16-148410-0", "The avengers", 1000, "russo brothers");
		magzine.display();
		novel.display();
	}
	

}

