package week7.shapes;

public class Square implements  Shape{

    //instance variables
    private double side;

    //constructor
    public Square(double side) {

        this.side = side;
    }

    //class specific methods
    public double computeArea() {

        return side * side;
    }

    //toString
    public String toString() {
        return "Square with side " + side;
    }
}
