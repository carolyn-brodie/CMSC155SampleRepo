package week1;

public class SelectionOperator {
    public static void main(String[] args) {
        int x = -10;
        int y = 0;

        y = x >= 0 ? x : -x;

        System.out.println("y is " + y);

        y = 0;
        if (x >= 0)
            y = x;
        else
            y = -x;

        System.out.println("y is " + y);

    }
}
