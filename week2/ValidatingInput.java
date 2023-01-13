package week2;
import java.util.Scanner;

public class ValidatingInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double value; // declare variable before loop.
        do
        {
            System.out.print("Please enter a positive number: ");
            value = in.nextDouble();
        } while (value <= 0);
        System.out.println("Value is " + value);

    }
}
