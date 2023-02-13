package week6;

public abstract class Person {

    private String name;
    private String phone;
    private String address;

    public Person(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public abstract void findLocationInfo();

    public abstract String formatAddress();

    public String getAddress() {
        return address;
    }

    public String toString() {
        return name + " with phone " + phone + " and address" + address;
    }
}
