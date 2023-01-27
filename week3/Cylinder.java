package week3;

public class Cylinder {

    //attributes
    private Circle base;
    private double h;

    //constructor
    public Cylinder (Circle base, double height) {
        this.base = base;
        this.h =height;
    }

    //other methods
    public double calculateVolume() {
        return base.calculateArea() * this.h;
    }

    //toString
    public String toString() {
        return "Cylinder's height is " + h + " base + " + base.toString();
    }


}
