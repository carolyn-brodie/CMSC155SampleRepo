package week6;

public class Customer extends Person {

    private int accountNumber;
    private String salesArea;

    public Customer(String name, String phone, String address, int accountNumber, String salesArea) {
        super(name, phone, address);
        this.accountNumber = accountNumber;
        this.salesArea = salesArea;
    }

    public void findLocationInfo() {
        if (salesArea.equals("Eastern Region")) {
            System.out.println("Boston Warehouse");
        } else if (salesArea.equals("Midwest Region")) {
            System.out.println("Chicago Warehouse");
        } else {
            System.out.println("Denver Warehouse");
        }
    }

    public String formatAddress() {
        return "Customer is in the " + salesArea + " with address  "+ super.getAddress();

    }

    public String toString() {
        String out = super.toString();
        out += " with account number " + accountNumber + " and sales region " + salesArea;
        return out;
    }


}
