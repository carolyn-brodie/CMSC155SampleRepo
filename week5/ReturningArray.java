package week5;

import java.util.Arrays;

public class ReturningArray {
    public static int[] findNumbersLessThan(int[] array, int number) {

        int[] tempArray = new int[array.length];
        int count = 0;
        for (int element : array) {
            if (element < number){
                tempArray[count] = element;
                count++;
            }
        }

        int[] resultArray = new int[count];
        for (int position = 0; position < count; position++){
            resultArray[position] = tempArray[position];
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] input = {10, 2, 30, 6, 7};
        System.out.println(Arrays.toString(findNumbersLessThan(input, 9)));
    }

}
