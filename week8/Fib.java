package week8;

public class Fib {
    public static long iterativeFib(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            long fibNMinus1 =1;
            long fibNMinus2 = 0;
            long fibN = 0;
            for (int count = 2; count <= n; count++) {
                fibN = fibNMinus1 + fibNMinus2;
                fibNMinus2 = fibNMinus1;
                fibNMinus1 = fibN;
            }
            return fibN;
        }
    }

    public static long recursiveFib(int n) {
        if (n == 0 ) return 0;
        else if (n == 1) return 1;
        else return recursiveFib(n-1) + recursiveFib(n-2);
    }

    public static long memoFib(int n, long[] values) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else if (values[n] != 0) return values[n];
        else {
            values[n] = memoFib(n-1, values) + memoFib(n-2, values);
            return values[n];
        }
    }



    public static void main(String[] args) {
        int fibNumber = 40;
        long preTime=System.currentTimeMillis();
        System.out.println(iterativeFib(fibNumber));
        long postTime=System.currentTimeMillis();
        System.out.println("Iterative time taken is " + (postTime - preTime) + " milliseconds");
        System.out.println("-------------------------------------------------------------------------------");

        preTime = System.currentTimeMillis();
        System.out.println(recursiveFib(fibNumber));
        postTime = System.currentTimeMillis();
        System.out.println("Recursive time taken is " + (postTime - preTime) + " milliseconds");
////
////        System.out.println("-------------------------------------------------------------------------------");
        preTime = System.currentTimeMillis();
        System.out.println(memoFib(fibNumber, new long[fibNumber+1]));
        postTime = System.currentTimeMillis();
        System.out.println("Memoization time taken is " + (postTime - preTime) + " milliseconds");

    }

}
    