package week12;

public class Book implements Comparable<Book>{

    //instance variables
    private String title;
    private String author;
    private double price;

    //constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int compareTo(Book other) {
        if (this.author.compareTo(other.author) == 0) {
            return this.title.compareTo(other.title);
        } else {
            return this.author.compareTo(other.author);
        }
    }

    public int compareTitle(Book other) {
        return this.title.compareTo(other.title);
    }



    public String toString() {
        return title + " by " + author + " costs " + price;
    }
}
