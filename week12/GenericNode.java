package week12;

public class GenericNode<T> {

    //attributes
    private int value;
    private GenericNode link;

    //constructor
    public GenericNode(int value) {
        this.value = value;
        link =null;
    }

    //other methods
    public void setLink(GenericNode newNode) {

        link = newNode;
    }


    public int getValue() {

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
