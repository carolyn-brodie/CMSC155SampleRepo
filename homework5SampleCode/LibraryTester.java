package homework5SampleCode;

public class LibraryTester {
    public static void main(String[] args) {
        Library southSide = new Library("South Side");
        southSide.addBook(new Book("Gone with the Wind", "Mitchell", 3));
        southSide.addBook(new Book("Pride and Prejudice", "Austin",4));
        System.out.println(southSide);
    }
}
