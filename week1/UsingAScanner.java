package week1;
import java.util.Scanner;
public class UsingAScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int num = input.nextInt();
        System.out.println("num squared = " + num * num);
        input.close();
    }


}
