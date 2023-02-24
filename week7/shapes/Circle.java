package week7.shapes;

public class Circle implements Shape {

    //instance variables
    private double radius;

    //constructor
    public Circle(double rad) {
        radius = rad;
    }

    //class specific methods
    public double computeArea() {

        return Math.PI * Math.pow(radius,2);
    }

    //toString method
    public String toString() {
        return "Circle with radius " + radius;
    }
}
