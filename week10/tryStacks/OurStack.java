package week10.tryStacks;

import java.util.Arrays;

public class OurStack {

    private static final int DEFAULT_CAPACITY = 10;
    private String[] elements;
    private int size;

    public OurStack() {
        elements = new String[DEFAULT_CAPACITY];
        size = 0;
    }

    public void push(String item) {

    }

    public String pop() {
        String top = "";
        return top;
    }

    public String peek() {
        String top = "";
        return top;
    }

    private void increaseCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public String toString() {
        String out = "";
        for (int count = 0; count < size; count++) {
            out = out +  elements[count] + " ";
        }
        return out;
    }

}
