package week12;

import java.util.ArrayList;
import java.util.Collections;

public class BankTester {
    public static void main(String[] args) {
        ArrayList<BankAccount> accts = new ArrayList<>();
        accts.add(new BankAccount("Bob", 123));
        accts.add(new BankAccount("Alan", 98));
        accts.add(new BankAccount("Bob", 5500));
        System.out.println(accts);
        Collections.sort(accts, (first, second)->{
            return second.getOwner().compareTo(first.getOwner());
        });

        System.out.println(accts);
        Collections.sort(accts, (first, second)->{
            if(first.getOwner().compareTo(second.getOwner()) == 0) {
                return (int) (second.getBalance() - first.getBalance());
            } else {
                return second.getOwner().compareTo(first.getOwner());
            }
        });

        System.out.println(accts);

    }
}
