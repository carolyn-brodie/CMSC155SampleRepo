package week2;

import java.util.Scanner;

public class UsingASentinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userTyped;
        boolean done = false;
        int sum = 0, count = 0;
        do
        {
            System.out.print("Input an integer (Q to quit): ");
            userTyped = input.next();
            if (userTyped.equals("Q"))
                done = true; // NOTICE the .equals()
            else
            {
                sum += Integer.parseInt(userTyped);
                count++;
            }
        }
        while (!done);

        System.out.println("sum = " + sum + " count = " + count);
        if (count > 0) System.out.println("average = " + (double) sum/count);
        input.close();


    }
}
