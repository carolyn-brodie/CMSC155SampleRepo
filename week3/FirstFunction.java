package week3;

public class FirstFunction {
    public static double addNumbers(int number1, int number2, double number3) {
        double result  = number1 + number2 + number3;
        return result;
    }

    public static void main(String[] args) {
        double sum = addNumbers(1,2,3);
        System.out.println(sum);

        //Another way to use this if you only want to see the result
        //System.out.println(addNumbers(1,2,3));
    }
}
