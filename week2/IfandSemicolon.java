package week2;

public class IfandSemicolon {

    public static void main(String[] args) {
        int number = 5;

        // Be careful with semicolons and if statements.
        // if you do not have {} after your if condition,
        // Java assumes that the statement inside if end's with
        // the first semicolon it finds.
        if (number > 10);
            System.out.println("Inside If???");
    }
}
