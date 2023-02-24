package week7.ipadExample;

public class Product2 {
    private Ipads type;



    public Product2(Ipads type) {
        this.type = type;


    }

    public double computePrice() {
       return type.calulatePrice();
    }


    public String toString() {
        return type + " has and costs $" + computePrice();
    }

}
