package week7.week7Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareStrings {

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "efgh";

        //System.out.println("Shows that s1 should come before s2:" + s1.compareTo(s2));
        System.out.println("Shows that s2 should come after s1:" + s2.compareTo(s1));

        String[] strArray = {"oranges", "apples", "bananas"};

        ArrayList<String> lst = new ArrayList<>(Arrays.asList(strArray));

        System.out.println(Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println(Arrays.toString(strArray));

        System.out.println(lst);
        Collections.sort(lst);
        System.out.println(lst);



    }
}
