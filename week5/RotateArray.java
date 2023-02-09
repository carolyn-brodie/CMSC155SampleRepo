package week5;

import java.util.Arrays;

public class RotateArray {

    public static int[] rotate(int[] array) {
        //If the array {1,2,3,4,5,6,7,8} is passed into the method,
        // the array should contain [8, 1, 2, 3, 4, 5, 6, 7] afterwards.
        int saveNumber1 = array[array.length-1];
        int saveNumber2 = 0;
        for (int index = 0; index < array.length; index++) {
            saveNumber2 = array[index];
            array[index] = saveNumber1;
            saveNumber1 = saveNumber2;
        }

        return array;
    }

    public static int[] rotate2(int[] array) {
        int last = array[array.length-1];
        for (int index = array.length-2; index >= 0; index--) {
            array[index+1] = array[index];
        }
        array[0] = last;
        return array;
    }



    public static void main(String[] args) {
        int[] test = {1,2,3,4};
        System.out.println(Arrays.toString(rotate2(test)));
    }
}
