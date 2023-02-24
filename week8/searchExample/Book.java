package week8.searchExample;

public class Book  implements Comparable<Book> {
	
	//instance variables
	private String title;
	private String author;
	private double price;
	
	
	//constructor
	public Book(String title, String author, double price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}


	public int compareTo(Book other) {
		if (title.compareTo(other.title) == 0) {
			if (author.compareTo(other.author) == 0) {
				return (int) (price - other.price);
			} else
				return author.compareTo(other.author);
		} else
			return title.compareTo (other.title);
	}

	//other methods
	public void changePrice(double newPrice)
	{
		price = newPrice;
	}
	
	public double returnPrice()
	{
		return price;
	}
	
	public boolean equals(Object obj)
	{
		if (obj instanceof Book)
		{
			Book book = (Book) obj;
			return (title.equals(book.title)) && 
					(author.equals(book.author)) &&
					(price == book.price);
		} else return false;
	}
	
	
	 
	
	//toString
	public String toString()
	{
		String out = title + " by " + author + " sells for " + price;
		return out;
	}
}
