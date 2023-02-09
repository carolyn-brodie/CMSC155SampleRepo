package week5;
import java.util.Arrays;
import java.util.Random;
public class createArrayOfRandom {

    public static int[] createRandoms(int size) {
        int[] numbers = new int[size];
        Random randomGenerator = new Random();
        int top =100, bottom  =0 ;

        for (int index = 0; index < size; index++) {
            numbers[index] = randomGenerator.nextInt(top - bottom) + bottom;
        }
        return numbers;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createRandoms(10)));
    }
}
