package week7.ipadExample;

public class Product {
    private String type;
    private int memorySize; // GigaBytes
    private boolean cellular;

    public Product(String type, int memory, String cell) {
        this.type = type;
        this.memorySize = memory;
        if (cell.equals("Cellular"))
            cellular = true;
        else
            cellular = false;
    }

    public double computePrice() {
        if (type.equals("iPad Pro 12.9")) {
            if (cellular) return ((12 * memorySize) + 160);
            else return (12 * memorySize);
        } else if (type.equals("iPad Pro 11")) {
            if (cellular) return ((11 * memorySize) + 150);
            else return (11 * memorySize);
        } else if (type.equals("iPad")) {
            if (cellular) return ((10 * memorySize) + 140);
            else return (10 * memorySize);
        } else return 0;
    }

    public String toString() {
        return type + " has " + memorySize + "GB memory, cellular is " + cellular +   " and costs $" + computePrice();
    }

}
