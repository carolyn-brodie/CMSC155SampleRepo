package week1;

import java.text.DecimalFormat;

public class DecimalExample
{
    public static void main(String[] args)
    {

        double x = 11111.23456, y = 9.87;
        System.out.println("x = " + x + " y = " + y);

        DecimalFormat formatter2 = new DecimalFormat("#0,000.00");
        System.out.println("x = " + formatter2.format(x) + " y = "
                + formatter2.format(y));
    }
}

