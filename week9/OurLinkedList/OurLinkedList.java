package week9.OurLinkedList;

public class OurLinkedList {
    //instance variable
    private Node firstNode;


    //Constructor
    public OurLinkedList() {

        firstNode = null;
    }


    //addNode
    public void addNode(int value) {
        //create new Node and then decide where it goes
        Node newNode = new Node(value);
        if (firstNode == null) {
         firstNode = newNode;
        } else {
            Node currentNode = firstNode;
            while (currentNode.getLink() != null) {
                currentNode = currentNode.getLink();
            }
            currentNode.setLink(newNode);

        }

    }

    public int getValue(int position) {
        if (position < this.size()-1) {
            int currentPosition = 0;
            Node currentNode = firstNode;
            while (currentPosition < position) {
                currentNode = currentNode.getLink();
                currentPosition++;
            }
            return currentNode.getValue();
        } else return 0;


    }

    public int size() {
        int count = 0;
        Node currentNode = firstNode;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.getLink();
        }
        return count;
    }

    //insert
    public void insert(int position, int value) {
        Node newNode = new Node(value);
        if (position <= 0) {
            newNode.setLink(firstNode);
            firstNode = newNode;
        } else {
            Node currentNode = firstNode;
            int currentPosition = 0;
            while (currentPosition < position - 1 &&
                    currentNode.getLink() != null) {
                currentNode = currentNode.getLink();
                currentPosition++;
            }
            newNode.setLink(currentNode.getLink());
            currentNode.setLink(newNode);

        }
    }

    //Remove
    public void remove(int position) {
        if (this.size() > 0) {
            if (position >= this.size()) {
                position = this.size() - 1;
            }
            if (position <= 0) {
                firstNode = firstNode.getLink();
            } else {
                Node currentNode = firstNode;
                int currentPosition = 0;
                while (currentPosition < position - 1 &&
                        currentNode.getLink() != null) {
                    currentNode = currentNode.getLink();
                    currentPosition++;
                }
                Node nodeToDelete = currentNode.getLink();
                currentNode.setLink(nodeToDelete.getLink());
            }
        }

    }

    //toString
    public String toString() {
        String out = "";
        Node currentNode = firstNode;
        while (currentNode != null) {
            out = out + currentNode.getValue() + " ";
            currentNode = currentNode.getLink();
        }
        return out;
    }
}
