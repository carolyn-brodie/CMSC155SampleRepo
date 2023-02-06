package week5;

public class BookTester {
    public static void main(String[] args) {
        Book x = new Book("Python", "Dawson", 50.00);
        Book y = new Book("Big Java", "Horstmann", 93.33);
        x = y;
        x.changePrice(60.00);
        System.out.println(y);

    }
}
