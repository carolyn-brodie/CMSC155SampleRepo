package week6;

public class BookTester {

    public static void main(String[] args) {
        Book book1 = new Book( "McKinnily", "Sunshine", 25);
        System.out.println(book1);
        book1.changePrice(22);
        System.out.println(book1.returnPrice());

        Textbook book2 = new Textbook("Horstmann", "Big Java", 130, "Computer Science" );
        System.out.println(book2);
        book2.changePrice(140);
        System.out.println(book2.returnPrice());

    }
}
