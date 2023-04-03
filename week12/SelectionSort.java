package week12;

import java.util.Arrays;

public class SelectionSort {


    public static int[] sort(int[] array) {
        int minPos = 0;
        for (int currentPos = 0; currentPos < array.length; currentPos++) {
            //find the minimum
            minPos = findMinimum(array, currentPos);
            //put minimum in currentPosswap
            if (currentPos != minPos)
                array = swap(array, minPos, currentPos);
        }
        return array;
    }

    private static int[] swap (int[] array, int low, int high) {
        int temp = array[low];
        array[low] = array[high];
        array[high] = temp;
        return array;}

    private static int findMinimum(int[] array, int current) {
        int index = current; int min = array[current];
        for (int i = current+1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {10, 1, 4, 2, 45, 24};
        System.out.println(Arrays.toString(sort(array)));
    }

}

