package week5;

import java.util.ArrayList;

public class TryArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        System.out.println(myList);

        myList.add(5);
        System.out.println(myList);
        myList.add(1);
        System.out.println(myList);
        myList.add(1, 3);
        System.out.println(myList);
        myList.set(0, 4);
        System.out.println(myList);
        //int x = myArray[1];
        int x = myList.get(1);
        System.out.println("x = " + x);
        myList.add(myList.get(1));
        System.out.println(myList);
        System.out.println("Number of elements in my list " + myList.size());
        myList.remove(myList.size() - 1);
        System.out.println(myList);
//
//        System.out.println(myList);
////        myList.remove(myList.size());

    }
}
