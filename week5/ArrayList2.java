package week5;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2 {
    public static void main(String[] args) {

        Double[] initial = {3.2, 7.9, 11.2, 7.9};
        ArrayList<Double> doubleList = new ArrayList<>(Arrays.asList(initial));
        System.out.println(doubleList);
        while (doubleList.contains(7.9)) {
            doubleList.remove(7.9);
            System.out.println(doubleList);
        }

        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(new Pet("Dog", "Marsha", 100));
        petList.add(new Pet("Cat", "Tucker", 120));
        petList.add(new Pet("Fish", "Goldy", 3));

        Pet Tucker = new Pet("Cat", "Tucker", 120);
        System.out.println(petList.contains(Tucker));

        System.out.println(petList.indexOf(new Pet("Hamster", "George", 5)));

    }
}