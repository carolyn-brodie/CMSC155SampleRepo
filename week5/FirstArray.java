package week5;

import java.util.Arrays;

public class FirstArray {
    public static void main(String[] args) {

        double[] temperatures = {2.3, 1.0, -4.2};
        double temp2[] = {6.4, 4.2};
        int[] numbers;
        numbers = new int[5];
        String[] strArray = new String[6];
        System.out.println(Arrays.toString(strArray));

        System.out.println(Arrays.toString(numbers));
//        numbers[0] = 10;
//        numbers[1] = 15;
//        System.out.println(Arrays.toString(numbers));
//
//        Pet[] petArray = {new Pet("Dog", "Fido", 2), new Pet("Cat", "Kitty", 1)};
//
//        System.out.println(Arrays.toString(petArray));
//        System.out.println(petArray[1]);

        String str = "hi there";
        System.out.println("String length is " + str.length() );
        System.out.println("array " + temperatures.length);
        System.out.println(temperatures[0]);
        System.out.println(temperatures[temperatures.length - 1]);
    }

}