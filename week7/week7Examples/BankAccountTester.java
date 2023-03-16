package week7.week7Examples;

import java.util.Arrays;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount suzyAccount = new BankAccount("Suzy Q", 7234);
//        System.out.println(suzyAccount);
        suzyAccount.deposit(100);
//        suzyAccount.deposit(10);
//        System.out.println(suzyAccount);
//        suzyAccount.withdraw(10.10);
//        System.out.println(suzyAccount);

        BankAccount[] bankArray = {suzyAccount, new BankAccount("Suzy Q", 1456),
                                 new BankAccount("Adele", 3456)};
        System.out.println(Arrays.toString(bankArray));
        Arrays.sort(bankArray);
        System.out.println(Arrays.toString(bankArray));


    }
}
