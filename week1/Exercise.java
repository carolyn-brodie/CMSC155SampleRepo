package week1;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = inp.nextInt();

        if (x % 2 == 0) {
            System.out.println("It is even");
        } else {
            System.out.println("It is odd");
        }

    }
}
