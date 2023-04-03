package week12;

import java.util.Arrays;

public class OurStack<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private T[] elements;
    private int size;

    public OurStack(T[] emptyStack) {
        elements = emptyStack;
        size = 0;
    }

    public void push(T item) {
        elements[size] = item;
        size++;
    }

    public T pop() {
        T top = elements[size-1];
        size--;
        return top;
    }

    public T peek() {
        T top = elements[size-1];
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
