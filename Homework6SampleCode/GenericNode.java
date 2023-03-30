package Homework6SampleCode;

public class GenericNode<T> {

    //attributes
    private T value;
    private GenericNode link;

    //constructor
    public GenericNode(T value) {
        this.value = value;
        link =null;
    }

    //other methods
    public void setLink(GenericNode newNode) {

        link = newNode;
    }


    public T getValue() {

        return value;
    }
    //return the node
    public GenericNode getLink() {

        return link;
    }

    //toString
    public String toString() {

        return "" + value;
    }

}
