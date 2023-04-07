package week13.multidimensionalArrays;

public class RaggedArrays {
    public static void main(String[] args) {
        int[][] b;
        b = new int[3][];
        b[0] = new int[5];
        b[1] = new int[7];
        b[2] = new int[4];

        PrintUtils.printIntMatrix(b);
    }
}
