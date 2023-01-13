package week3;

public class TryParameters {

    public static double addNumbers(int number1, int number2, double number3)
    {
        double result  = number1 + number2 + number3;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(addNumbers(1,2,3));
    }

}
