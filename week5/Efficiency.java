package week5;

import java.util.ArrayList;

public class Efficiency {
    public static void main(String[] args) {
        int length = 10000000;   	// 10 million
        int[] array = new int[length];

        System.out.println("ArrayStart");
        for (int i = 0; i < length; i++) array[i] = i;
        System.out.println("ArrayDone");

        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("ArrayListStart");
        for (int i = 0; i < length; i++) arrayList.add(i);
        System.out.println("ArrayListDone");
    }
}

