package homework5SampleCode;

public class Book {

    //instance variables
    private String title;
    private String author;
    private int numberOfCopies;

    //constructor
    public Book(String title, String author, int number) {
        this.title = title;
        this.author = author;
        numberOfCopies = number;
    }

    public void updateCopies (int additionalCopies) {
        numberOfCopies += additionalCopies;
    }

    public String toString() {
        return title + " by " + author + " has copies of " + numberOfCopies;
    }
}
