package week3;

public class CircleTester {

    public static void main(String[] args) {
        Circle circ = new Circle(4);
        System.out.println(circ);
        System.out.println(circ.calculateArea());
        Cylinder cyl = new Cylinder(circ, 5);
        System.out.println(cyl);
        System.out.println(cyl.calculateVolume());
    }


}
