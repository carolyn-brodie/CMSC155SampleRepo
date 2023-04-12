package week13.FileIO;

import java.util.EmptyStackException;

public class OurStack {

    private static final int DEFAULT_CAPACITY = 3;
    private String[] elements;
    private int size;

    public OurStack() {
        elements = new String[DEFAULT_CAPACITY];
        size = 0;
    }

    public void push(String item) throws StackOutOfRoom{
        if (size < elements.length) {
            elements[size++] = item;
        } else {
            throw new StackOutOfRoom("Stack full");
        }
    }

    public String pop() {
        String top = "";
        if (size > 0) {
            top = elements[size - 1];
            size--;
        } else {
            throw new EmptyStackException();
        }
        return top;
    }

    public String peek() {
        String top = "";
        if (size > 0) {
            top = elements[size - 1];
        } else {
            throw new EmptyStackException();
        }
        return top;
    }

//    private void increaseCapacity() {
//        int newSize = elements.length * 2;
//        elements = Arrays.copyOf(elements, newSize);
//    }

    public String toString() {
        String out = "";
        for (int count = 0; count < size; count++) {
            out = out +  elements[count] + " ";
        }
        return out;
    }

}
