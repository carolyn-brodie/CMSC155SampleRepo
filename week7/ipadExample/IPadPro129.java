package week7.ipadExample;

public class IPadPro129 implements Ipads {

    private int memorySize;

    public IPadPro129(int memory) {
        this.memorySize = memory;
    }

    public double calulatePrice() {
        return 8 * memorySize;
    }

    public String toString() {
        return "iPad Pro 12.9 with " + memorySize + " GBs of memory";
    }
}
