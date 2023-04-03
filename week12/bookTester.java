package week12;

import java.util.Arrays;

public class bookTester {

    public static void main(String[] args) {

        Book[] array = {new Book("Hitch Hiker's Guide to the Galaxy", "Douglas Adams", 7.88),
                new Book("Skin Walkers", "Tony Hillerman", 34.57),
                new Book("A Dark Wind", "Tony Hillerman", 10.79),
                new Book("And Then There Were None", "Agatha Christy", 8.99)};

        //Sort using the compareTo method in Book by author and then title
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

        //Now sort by price
    }



}
