package week7.ipadExample;

public class Product {
    private String type;
    private int memorySize; // GigaBytes


    public Product(String type, int memory) {
        this.type = type;
        this.memorySize = memory;

    }

    public double computePrice() {
        if (type.equals("iPad Pro 12.9")) {
            return (8 * memorySize) ;

        } else if (type.equals("iPad Pro 11")) {
            return (7 * memorySize);

        } else if (type.equals("iPad")) {
            return (5 * memorySize);

        } else return 0;
    }


    public String toString() {
        return type + " has " + memorySize + "GB memory,  and costs $" + computePrice();
    }

}
