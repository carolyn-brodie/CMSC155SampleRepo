package week2;

public class FirstWhile {
    public static void main(String[] args) {

        int i = 10;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        i = 10;
        do {
            System.out.print(i + " ");
            i++;
        } while(i < 10);
    }
}
