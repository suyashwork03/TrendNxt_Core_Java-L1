

class Book {
	String isbn, title, author;
	float price;

	public Book(String isbn, String title, String author, float price) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	
	public void details() {
		System.out.println("Book [isbn=" + isbn + ", title=" + title + ", author=" + author + ", price=" + price + "]");
	}
	
	public float calculateDiscount(float percentage)
	{
		price=price-((percentage/100)*price);
		return price;
	}
	

}

public class Topic2Assignment1
{
	public static void main(String a[])
	{
		Book book=new Book("978-3-16-148410-0", "The Avengers", "russo brothers", 1000);
		book.details();
		float finalPrice=book.calculateDiscount(10);
		System.out.println("Discounted price "+finalPrice);

	}
	
	
}
