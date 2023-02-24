package week8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecurseInArrayList {
    public static double addList(List<Double> lst) {
        if (lst.size() == 0) return 0;
        else return lst.get(0) + addList(lst.subList(1,lst.size()));
    }


    public static void main(String[] args) {
        Double[] doubleArray = {2.2,3.0,5.6};
        List<Double> d1 = new ArrayList<>(Arrays.asList(doubleArray));
        System.out.println(addList(d1));
    }
}


