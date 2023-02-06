package week5;

import java.util.ArrayList;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount samAccount = new BankAccount("Sam");
        samAccount.deposit(110);
        BankAccount sam2Account = samAccount.copy();
        BankAccount sam3Account = new BankAccount("Sam", 111, 30);
        BankAccount sam4Account = samAccount;

//        System.out.println(samAccount.equals(sam2Account));
//        System.out.println(samAccount.equals(sam3Account));
//        System.out.println(samAccount.equals(sam4Account));

//        ArrayList<BankAccount> lst = new ArrayList<>();
//        lst.add(samAccount);
//        System.out.println(lst.contains(samAccount));
//        System.out.println(lst.contains(sam2Account));


    }

}
    