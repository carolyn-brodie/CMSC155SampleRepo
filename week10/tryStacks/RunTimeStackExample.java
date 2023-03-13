package week10.tryStacks;

public class RunTimeStackExample {

    public static void firstMethod()
    { secondMethod(); thirdMethod(); }

    public static void secondMethod()
    { thirdMethod(); fourthMethod(); }

    public static void thirdMethod()
    { fourthMethod(); }

    public static void fourthMethod()
    { System.out.println("hi"); }

    public static void main()
    { firstMethod(); }

    public static void main(String[] args) {
        firstMethod();
    }

}
