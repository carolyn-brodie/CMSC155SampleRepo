package week7.week7Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortingPrimitives {
    public static void main(String[] args) {
        Integer[] array = {2, -5, 3, 0, 7, -11};
        ArrayList<Integer> lst = new ArrayList<>(Arrays.asList(array));

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        Collections.sort(lst);
        System.out.println(lst);




    }

}
