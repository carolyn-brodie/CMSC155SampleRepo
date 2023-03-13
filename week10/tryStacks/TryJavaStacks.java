package week10.tryStacks;

import java.util.Stack;

public class TryJavaStacks {
    public static void main(String[] args) {
        Stack<String> temp = new Stack<>();
        temp.push("how");
        temp.push("are");
        String x = temp.pop();
        temp.push("you");
        temp.push("now");
        String y = temp.peek();
        temp.push("one");
        String z = temp.pop();
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println(temp);

    }
}
