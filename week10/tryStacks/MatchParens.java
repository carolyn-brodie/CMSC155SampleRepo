package week10.tryStacks;

public class MatchParens {

    public static boolean matched(String input) {
        int openCount = 0;
        int closeCount = 0;
        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == '(') {
                openCount++;
            } else if (input.charAt(index) == ')') {
                closeCount++;
            }
        }
        if (openCount == closeCount) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(
                matched("x + (y – z * (sine(30 + a – (b+c)) + 5)\n"));
    }

}
