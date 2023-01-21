package week2;

public class FivetoTwentyFive {
    public static void main(String[] args) {
        int total = 0;
        for (int number = 5; number <= 25; number++) {
            total += number;
        }
        System.out.println(total);

        total = 0;
        int number = 5;
        while (number <= 25) {
            total += number;
            number++;
        }
        System.out.println(total);

        total = 0;
        number = 5;
        do {
            total += number;
            number++;
        }while(number <= 25);
        System.out.println(total);
    }
}
