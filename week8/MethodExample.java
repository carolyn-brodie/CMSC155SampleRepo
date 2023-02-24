package week8;

public interface MethodExample {

    public static void method1() {
        System.out.println("Method 1");
        int x = 0;
        for (int i = 0; i < 5; i++) {
            x += i;
        }
        method2();
    }

    public static void method2() {
        int x = 5;
        System.out.println("Method 2");
        method3();
    }

    public static void method3() {
        int x = 100;
        System.out.println("Method 3");
    }



    public static void main(String[] args) {
        method1();

    }
}
