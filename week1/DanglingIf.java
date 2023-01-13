package week1;

public class DanglingIf {
    public static void main(String[] args)
    {
        int num1 = 15, num2 = 5;
        if (num1 > 10)
        {

            if (num2 > 10)
                System.out.println("num1 and num2 greater than 10");
        }
        else System.out.println("num1 <= 10");
    }

}
