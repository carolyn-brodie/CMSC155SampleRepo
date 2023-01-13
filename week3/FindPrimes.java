package week3;

public class FindPrimes {

    public static boolean isPrime(int number) {

        boolean divisorFound = false;

        for (int divisor = 2; divisor <= Math.sqrt(number); divisor ++) {
            if (number % divisor == 0) {
                divisorFound = true;
            }
        }
        return !divisorFound;
    }

    public static void printPrimes(int endValue) {

        for (int number = 1; number <= endValue; number++)
        {
            if (number %100 == 0) {
                System.out.println();
            }
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static void main(String[] args) {
        printPrimes(100);
    }


}
