package week2;

public class UseBraces {
    public static void main(String[] args) {
        int row = 5;
        for (int column = 1; column <= row; column++)
            System.out.print(column + " ");
        System.out.print(" | ");

        System.out.println();
        for (int column = 1; column <= row; column++)
        {
            System.out.print(column + " ");
            System.out.print(" | ");
        }

    }
}
