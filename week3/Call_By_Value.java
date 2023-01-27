package week3;

public class Call_By_Value {
    public static void test(int x) {
        x = 5;
        System.out.println(x);
    }

    public static void main(String[] args) {
        int y = 6;
        System.out.println("Before " + y);
        test(y);
        System.out.println("After "  + y);
    }

}
