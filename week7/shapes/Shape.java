package week7.shapes;

public interface Shape {

    int QUARTER = 25;
//    double computeArea();

    default double computeArea()
    {
        return 2.5;
    }

    static int addNumbers(int a, int b) {
        return a + b;
    }

}
