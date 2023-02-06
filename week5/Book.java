package week5;

public class Book {

    //instance variables
    private String title;
    private String author;
    private double price;

    //constructor
    public Book(String title, String name, double price ) {
        this.title = title;
        author = name;
        this.price = price;
    }

    //other methods
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book other = (Book) obj;
            return (title.equals(other.title)) &&
                    (author.equals(other.author)) &&
                    (price == other.price);
        } else return false;
    }

    public void changePrice(double newPrice) {
        price = newPrice;
    }


    //toString
    public String toString() {
        String out = title + " by " + author;
        out = out + " with price " + price;
        return out;
    }

}
    