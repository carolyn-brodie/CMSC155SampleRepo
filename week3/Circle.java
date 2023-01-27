package week3;

public class Circle {


    // attributes
    private double radius;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //other methods
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    //toString() method
    public String toString() {
        return "Circle with radius " + radius;
    }


}
