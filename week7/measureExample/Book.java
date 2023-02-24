package week7.measureExample;

 

public class Book  implements Measure {
	
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

	public double getMeasure() {
		return price;
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
