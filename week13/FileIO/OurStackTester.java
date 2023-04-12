package week13.FileIO;


import java.util.EmptyStackException;

public class OurStackTester {
    public static void main(String[] args) {
        String x = "";
        String y = "";
        OurStack temp = new OurStack();
        try {
            temp.push("I");
            temp.push("am");
            temp.push("not");

            temp.pop();            // removes "not"
            temp.push("fine");
            x = temp.peek();    // should be "fine"

            temp.push("how");
            temp.push("are");
            temp.push("you");

            y = temp.pop();    // should be "you"
        } catch(EmptyStackException | StackOutOfRoom e) {
            System.out.println("Stack is empty " + e);
        }

        System.out.println("x = " + x + " y = " + y);
        System.out.println(temp);  //should be ["I" "am" "fine" "how" "are"]
    }
}
