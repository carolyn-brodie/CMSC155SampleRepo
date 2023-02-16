package week6;

public class Book {

    private String author;
    private String title;
    private double price;

    public Book(String author, String title, double price) {
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public void changePrice(double newPrice) {
        price = newPrice;
    }

    public double returnPrice() {
        return price;
    }




    public String toString() {
        return title + " is by " + author + " and sells for $" + price;
    }
}
