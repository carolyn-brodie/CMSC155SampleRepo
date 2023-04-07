package week13.FileIO; /**
 * Created by Owner on 4/8/2017.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args)  {
        List<String> list = new ArrayList<>();
        list.add("First String");
        int count = 100;
        Scanner in = null;
        try {
            // Try reading from a file
            //File  reader = new File("E:\\myData\\firstFile.txt");
            File reader = new File ("firstFile.txt");
            in = new Scanner (reader);
            String word = "";

            while (in.hasNext ()) {
            //while (count > 0) {
                word = in.next ();
                //word = in.nextLine ();
               // System.out.println (word);
                list.add(word);
                count--;

            }
            in.close();
      //  } catch (FileNotFoundException  | IndexOutOfBoundsException exception) {
        } catch (FileNotFoundException | NoSuchElementException  exception) {
            System.out.println("An Error Occurred " + exception);
        } finally {
            if (in != null)
                in.close();

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }


        }
    }

}
