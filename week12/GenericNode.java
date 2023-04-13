package week12;

public class GenericNode<I> {

    //attributes
    private I value;
    private GenericNode link;

    //constructor
    public GenericNode(I value) {
        this.value = value;
        link =null;
    }

    //other methods
    public void setLink(GenericNode newNode) {

        link = newNode;
    }


    public I getValue() {

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
