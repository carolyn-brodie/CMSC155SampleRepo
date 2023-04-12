package week13.FileIO; /**
 * Created by Owner on 4/8/2017.
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIOExample {

    public static int countLinesContainingWord(String fileName, String targetWord) throws FileNotFoundException {
        Scanner inputFile = new Scanner(new FileReader(fileName));
        int count = 0;

        while (inputFile.hasNextLine())
        {
            String[] words = inputFile.nextLine().split(" ");
            boolean containsTarget = false;

            for (String word : words)
                if (word.equals(targetWord) && !containsTarget)
                {
                    count++;
                    containsTarget = true; // Make sure the same line is not counted more than once.
                }
        }

        inputFile.close();

        return count;
    }

    public static void reverseLines(String fileName) throws FileNotFoundException
    { // Reverse the lines in a file.

        Scanner inputFile = new Scanner(new FileReader(fileName));
        ArrayList<String> allLines = new ArrayList<String>();

        while (inputFile.hasNextLine())
        {
            String currentLine = inputFile.nextLine();
            allLines.add(currentLine);
        }
        inputFile.close(); // Finished reading in the entire file.

        PrintWriter output = new PrintWriter(fileName);
        // Now open file for writing, and write it out in reverse order.

        for (int count = allLines.size() - 1; count >= 0; count--)
        {
            output.print(allLines.get(count) + "\n");
        }
        output.close();
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("Count of the: " + countLinesContainingWord("test.txt", "the"));
        System.out.println("Count of line: " + countLinesContainingWord("test.txt", "line"));
        System.out.println("Count of \" \": " + countLinesContainingWord("test.txt", " "));
        System.out.println("Count of \"\": " + countLinesContainingWord("test.txt", ""));
        System.out.println("Count of helloooo: " + countLinesContainingWord("test.txt", "helloooo"));

        reverseLines("test.txt");
    }
}
