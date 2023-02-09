package week5;

import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {
        int[] first = {1,2,3,4};
        int[] alias = first;
        int[] copyArray = new int[first.length];
        System.arraycopy(first, 0, copyArray, 0, first.length );
        System.out.println(first == alias);
        first[0] = 100;
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(alias));
        System.out.println(Arrays.toString(copyArray));
    }
}
