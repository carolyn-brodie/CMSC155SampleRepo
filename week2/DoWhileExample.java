package week2;

public class DoWhileExample {
    public static void main(String[] args) {
        double number = 100;
        int divisor = 3, count = 0;
        do
        {
            number /= divisor;
            System.out.println(number);
            count++;
        }
        while (number >= divisor);

        System.out.println("count = " + count);

    }
}
