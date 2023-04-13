package week12;

import java.util.ArrayList;
import java.util.Collections;

public class Exercise {
    public static void main(String[] args) {
        ArrayList<Book> booklst = new ArrayList<>();
        booklst.add(new Book("Big Java", "Cayman", 130));
        booklst.add(new Book("Python", "Adams", 50));
        booklst.add(new Book("C", "Adams", 20));
        System.out.println(booklst);

        Collections.sort(booklst, (first,second)-> {
            if (first.getAuthor().compareTo(second.getAuthor()) == 0) {
                return first.getTitle().compareTo(second.getTitle());
            } else {
                return first.getAuthor().compareTo(second.getAuthor());
            }
        });

        System.out.println(booklst);

    }
}
