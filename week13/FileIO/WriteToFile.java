package week13.FileIO;

/**
 * Created by Owner on 4/9/2017.
 */

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class WriteToFile {


    public static void appendString(String three) throws IOException {
        PrintWriter out = new PrintWriter (new FileWriter ("out.txt", true));
        out.print (three);
        out.close ();

    }

    public static void writeString(String one, String two) throws FileNotFoundException {

        PrintWriter out = new PrintWriter ("out.txt");

        out.println (one);
        out.println (two);
        out.close ();

    }


    public static void main(String[] args) {
        try {
            writeString ("Line 1", "Line 2");
          //  appendString ("Here is more");
        } catch (IOException exception) {
            System.out.println ("File Not Found " + exception);
        }
    }

}
