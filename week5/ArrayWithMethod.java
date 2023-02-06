package week5;

import java.util.Arrays;

public class ArrayWithMethod {

     public static int multiplyArrayElements(int[] numbers) {
        int product = 1;
        for (int number : numbers)
            product *= number;
        return product;
    }

    public static int[] createArrayOfLargerElements(int[] array1, int[] array2) {
        int[] newArray = new int[array1.length];

        for (int count = 0; count < array1.length; count++)
            if (array1[count] > array2[count])
                newArray[count] = array1[count];
            else
                newArray[count] = array2[count];

        return newArray;
    }


    public static void main(String[] args) {
        int[] arrayA = {2,3,4,5};
        int[] arrayB = {5,4,3,2};
        //System.out.println(multiplyArrayElements(arrayA));
        System.out.println(Arrays.toString(createArrayOfLargerElements(arrayA,arrayB)));



    }
}
