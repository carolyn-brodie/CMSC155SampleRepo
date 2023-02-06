package week5;

import java.util.Arrays;


public class ArraySizeAdjustment {
    public static int[] findNumbersLessThan(int[] array, int number) {
        int[] temp = new int[array.length];
        int count = 0;
        for (int element : array) {
            if (element < number) {
                temp[count] = element;
                count++;
            }
        }
        int[] outArray = new int[count];
        for (int index = 0; index < count; index++)
            outArray[index] = temp[index];

        return outArray;
    }



    public static void main(String[] args) {
        int[] test = {10,4,2,5,17};
        System.out.println(Arrays.toString(findNumbersLessThan(test,5)));
    }
}
