package week13.multidimensionalArrays;

public class PrintUtils {

    public static void printIntMatrix(int[][] matrix) {
            for (int[] row: matrix) {
                for (int value: row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
     }

    public static <E> void printGenericMatrix(E[][] matrix) {
        for (E[] row: matrix) {
            for (E value: row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
