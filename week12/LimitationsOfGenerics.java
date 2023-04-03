package week12;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Owner on 4/17/2017.
 */

public class LimitationsOfGenerics<T>{


    private T[] array;
    private ArrayList<T> lst;

    public LimitationsOfGenerics() {
//        array = new T[10];   //can't do this
//          lst = new ArrayList<>();
    }

    public static <E> E[] fillWtihDefaults(E[] array, E defaultValue) {
        for (int index = 0; index < array.length; index++) {
            //array[index] = new E();  //can't do this
            array[index] = defaultValue;
        }
        return array;
    }

    public static void main(String[] args) {
        String[] array = new String[3];
        System.out.println(Arrays.toString(fillWtihDefaults(array, "ZZZ")));
    }
}
