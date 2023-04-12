package week13.multidimensionalArrays;

public class TryArrays {

    public static void main(String[] args) {
        int[][] matrix = {{1,2},{3,4},{5,6}};

        //for loop
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //for each loop
        for (int[] row: matrix) {
            for (int value: row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

}
