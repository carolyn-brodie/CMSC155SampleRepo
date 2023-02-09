package week5;

import java.util.Arrays;

public class ExpandArray {
    public static void main(String[] args) {
        int[] first = {1,2,3,4};
        int[] copyArray = new int[first.length* 2];
        System.arraycopy(first, 0, copyArray, 0, first.length );
        first = copyArray;
        System.out.println(Arrays.toString(first));
    }
}
