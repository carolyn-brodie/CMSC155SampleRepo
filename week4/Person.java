package week4;

public class Person {

    //Instance Variables
    private String name;
    private String address;
    private String phone;


    //Constructor
    public Person(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    //Return true if two people have the same name
    public boolean compareNames(Person otherPerson) {
        if (name.equals(otherPerson.name))
            return true;
        else
            return false;
    }


    //For Printing
    public String toString() {
        return name + " lives at " + address + " with phone " + phone;
    }
}
