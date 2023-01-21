package week2;

public class BadprogPract {
    public static void main(String[] args) {
        for (int count = 1; count < 10; count++) {
            System.out.println(count);
            if (count > 5){
                count = 10;
                System.out.println("Inside count = " + count);
            }
        }
    }
}
