package week3;

public class ThoughtExercise {

    public static int func1(int x, String y) {
        return 0;
    }

    public static String func2(String x, int y){
        return "";
    }

    public static void main(String[] args) {
        int a = 3;
        String b = "";
        func1(2 * a, a + b);
        //func2(a, b);
        //func2(func2(b, a), int a);
        //func1(b.length(), func2("Hi", 2.0 * a));
        func2(b + func1(5, b), func1(a, b) + func1(a/2, b));
       // func1(func1(a, b) + func1(func1(a, b), func2(b, a)));





    }
}
