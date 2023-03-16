package week9.JavaLinkedLists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        lst.add(4);
        lst.add(10);
        lst.add(50);
        lst.add(2);
        System.out.println(lst);
        System.out.println(lst.size());
        ListIterator<Integer> iter = lst.listIterator();

        if(iter.hasNext()) {
            System.out.println(iter.next());
            System.out.println(iter.next());
        }
        iter.add(5);
        System.out.println(lst);
        if (iter.hasPrevious()) {
            System.out.println(iter.previous());
            System.out.println(iter.previous());
        }
    }
}
