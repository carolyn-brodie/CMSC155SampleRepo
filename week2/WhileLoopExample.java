package week2;

public class WhileLoopExample {
    public static void main(String[] args) {
        int target = 20;
        int total = 1;
        int factor = 2;
        int count = 0;
        while (total < target) {

            total *= factor;
            count++;
            System.out.print(" total = " + total);
        }
        System.out.println(); // prints a blank line
        System.out.println("count = " + count);
    }
}
