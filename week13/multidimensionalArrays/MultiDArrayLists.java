package week13.multidimensionalArrays;

import java.util.ArrayList;

public class MultiDArrayLists {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();
        lst.add(new ArrayList<>());
        lst.add(new ArrayList<>());
        lst.add(new ArrayList<>());
        lst.get(0).add(1);
        lst.get(0).add(2);
        lst.get(1).add(3);
        lst.get(2).add(4);

        System.out.println(lst);
    }

}
