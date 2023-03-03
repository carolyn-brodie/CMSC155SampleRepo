package week9.JavaLinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EfficiencyExample {
    public static void main(String[] args) {
        int length = 100000;
        List<String> llList = new LinkedList<>();
        llList.add("Dopey");
        System.out.println("Starting insert LinkedList");
        for (int i = 0; i < length; i++)
            llList.add(0,"Bashful");
        System.out.println("LinkedListDone");

        List<String> alList = new ArrayList<>(length);
        alList.add("Dopey");
        System.out.println("Starting insert ArrayList");
        for (int i = 0; i < length; i++)
            alList.add(0,"Bashful");
        System.out.println("ArrayListDone");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Start access LinkedList");
        for (int i = 0; i < length; i++)
            llList.get((int)(length * Math.random()));
        System.out.println("LinkedListDoneAccessing");

        System.out.println("Start access ArrayList");
        for (int i = 0; i < length; i++)
            alList.get((int)(length * Math.random()));
        System.out.println("ArrayListDoneAccessing");


    }
}
