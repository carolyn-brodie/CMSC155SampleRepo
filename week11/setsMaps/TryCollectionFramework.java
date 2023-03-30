package week11.setsMaps;

import java.util.*;

public class TryCollectionFramework {
    public static void main(String[] args) {
        List<Double> lst = new ArrayList<>();

        lst.add(2.2);
        lst.add(3.2);
        lst.remove(3.2);
        lst.set(0,1.2);
        System.out.println(lst.size());
        System.out.println(lst);
    }
}
