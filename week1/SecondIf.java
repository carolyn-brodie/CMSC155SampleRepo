package week1;
//What do you notice about the parenthesis
public class SecondIf
{
    public static void main(String[] args)
    {
        int num1 = 8, num2 = 11;
        if (num1 < 10) // NOTE: The test must be in parentheses.
        {
            if (num2 > 10)
            {
                System.out.println("Hi");
                System.out.println("Rye");
            }
            else System.out.println("Bye");
        }
        else System.out.println("Sigh");
    }
}
