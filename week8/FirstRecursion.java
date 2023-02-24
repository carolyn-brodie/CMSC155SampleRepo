package week8;

public class FirstRecursion {

    public static void printNumbers(int n) {
        if (n <= 0) System.out.println();
        else {
            System.out.print(n + " ");
            printNumbers(n-1);
        }
    }

    public static void main(String[] args) {
        printNumbers(4);
    }

}
    