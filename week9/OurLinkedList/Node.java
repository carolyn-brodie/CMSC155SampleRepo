package week9.OurLinkedList;

public class Node {

    //instance variables
    private int value;
    private Node link;

    //constructor
    public Node(int value) {
        this.value = value;
        link =null;
    }

    //other methods
    public void setLink(Node newNode) {

        link = newNode;
    }


    public int getValue() {

        return value;
    }
    //return the node
    public Node getLink() {

        return link;
    }

    //toString
    public String toString() {

        return "" + value;
    }



}
