package week5;
import java.util.Scanner;
import java.util.Arrays;

public class Bucket1 {

    public static int[] firstMethod() {
        Scanner input = new Scanner(System.in);
        int[] count = new int[10];

        boolean done = false;
        int value;
        while (!done) {
            System.out.print("Enter an integer between 0 and 100 or q to quit: ");
            String inValue = input.next();
            if (inValue.equalsIgnoreCase("q")) {
                done = true;
            } else {
                value = Integer.parseInt(inValue);
                if ((0 <= value) && (value < 10)) {
                    count[0]++;
                } else if ((10 <= value) && (value < 20)) {
                    count[1]++;
                } else if ((20 <= value) && (value < 30)) {
                    count[2]++;
                } else if ((30 <= value) && (value < 40)) {
                    count[3]++;
                } else if ((40 <= value) && (value < 50)) {
                    count[4]++;
                } else if ((50 <= value) && (value < 60)) {
                    count[5]++;
                } else if ((60 <= value) && (value < 70)) {
                    count[6]++;
                } else if ((70 <= value) && (value < 80)) {
                    count[7]++;
                } else if ((80 <= value) && (value < 90)) {
                    count[8]++;
                } else if ((90 <= value) && (value < 100)) {
                    count[9]++;
                }
            }

        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(firstMethod()));
    }
}
