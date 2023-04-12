package week13.multidimensionalArrays;

public class CalculateInterest {


    public static void main(String[] args) {
        final int noOfRows = 10;
        final int noOfColumns = 6;
        final int initialValue = 1000;
        final int startingRate = 5;

        Double[][] table = new Double[noOfRows][noOfColumns];

        for (int col = 0; col < noOfColumns; col++)
        {
            double rate = (startingRate + 0.5 * col)/100;
            table[0][col] = initialValue + initialValue * rate;

            for (int row = 1; row < noOfRows; row++)
                table[row][col] = table[row-1][col] + table[row-1][col]*rate;
        }
        PrintUtils.printGenericMatrix(table);
    }
}
