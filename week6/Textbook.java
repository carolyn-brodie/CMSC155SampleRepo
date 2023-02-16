package week6;

public class Textbook extends Book {

    private String subject;

    public Textbook(String author, String title, double price, String subject) {
        super(author, title, price);
        this.subject = subject;
    }

    @Override
    public void changePrice(double newPrice) {
        super.changePrice(newPrice + 10);
    }
    @Override
    public String toString() {
        String out = super.toString();
        out += " and subject " + subject;
        return out;
    }
}
