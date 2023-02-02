package week4;

public class PetTester {
    public static void main(String[] args) {
        Pet cat = new Pet("Cat", "Bill", 5);
        System.out.println(cat);
        cat.calledGoodPet(5);
        System.out.println(cat);
        Pet cat2 = new Pet("Cat", "Batman", 1);
        System.out.println(Pet.petNumber());


    }
}
