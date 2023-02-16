package week6;

import org.w3c.dom.ls.LSOutput;

public class PersonTester {
    public static void main(String[] args) {


        Object obj = new Object();
        System.out.println(obj);

        Person person1 = new Employee("Tom", "1334", "Some Address", "programmer");
        System.out.println(person1);

        Person person2 = new Customer("Sally", "111-111-1111", "First Street", 1234, "Eastern Region");
        System.out.println(person2);
        person1.findLocationInfo();


    }

}
