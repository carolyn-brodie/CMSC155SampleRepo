package week12;

public class GenericNodeTester {
    public static void main(String[] args) {
        GenericNode<String> node1 = new GenericNode<>("one");
        System.out.println(node1);
        System.out.println(node1.getValue());
        GenericNode<String> node2 = new GenericNode<>("two");
        node1.setLink(node2);
    }
}
