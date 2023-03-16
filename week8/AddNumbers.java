package week8;

public class AddNumbers {
    public static void printNumbers(int n) {
        if (n <= 0) System.out.println();
        else {
            System.out.print(n + " ");
            printNumbers(n-1);
        }
    }



    public static int addNumbers(int n) {

        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else return n + addNumbers(n-1);
    }

    public static void main(String[] args) {
        //printNumbers(4);
        System.out.println(addNumbers(4));

    }

}
    