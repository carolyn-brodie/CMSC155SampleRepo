package week1;

public class BadProgrammingPractice
{
    public static void main(String[] args)
    {
        int num1 = 10;
        int num2 = 2;

        //Don't do this!
        if (num1 < num2);
        else System.out.println("num1 is greater or equal to num2");


        //Instead do this
        if (num1 >= num2) System.out.println("num1 is greater or equal to num2");

    }
}
