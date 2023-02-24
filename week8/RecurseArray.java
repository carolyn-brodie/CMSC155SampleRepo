package week8;

public class RecurseArray {

    public static int sumArray(int[] array, int position) {
        if (position >= array.length) return 0;
        else return array[position] + sumArray(array, position + 1);
    }

    public static void main(String[] args) {
        int[] test = {10,21,3};
        System.out.println(sumArray(test,0));
    }

}
    