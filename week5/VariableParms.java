package week5;

public class VariableParms {

    public static double fun(int init, double... numbers ) {
        double total = init;
        for ( double d : numbers )
            total += d;
        if (numbers.length > 0)
            return total / numbers.length;
        else
            return 0;

    }


    public static void main(String[] args) {
        System.out.println(fun(0,10,20));
        System.out.println(fun(0,10));
        System.out.println(fun(1));
    }
}
