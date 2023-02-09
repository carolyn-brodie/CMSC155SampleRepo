package week5;

import java.util.Arrays;

public class TryLoops {

    public static void main(String[] args) {


        int[] myArray = {4, 3, 6, 10};

        for (int index = 0; index < myArray.length; index++ ) {
            myArray[index] += 10;
            System.out.print(myArray[index] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(myArray));

        int index = 0;
        while (index < myArray.length) {
            myArray[index] += 10;
            System.out.print(myArray[index] + " ");
            index++;
        }

        System.out.println();
        System.out.println(Arrays.toString(myArray));

        for (int element : myArray) {
            element += 10;
            System.out.print(element + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(myArray));
    }
}
