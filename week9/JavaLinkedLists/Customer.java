package week9.JavaLinkedLists;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Customer {

    //attribute
    private String name;
    private List<BankAccount> acctList;
    private ListIterator<BankAccount> iter;

    //constructor
    public Customer (String name) {
        this.name = name;
        this.acctList = new LinkedList<>();
        this.iter = acctList.listIterator();
    }

    public void addAccount(BankAccount acct) {
        if (!acctList.contains(acct)) {
            acctList.add(acct);
        }
    }

    public String toString() {
        String out  = name + " has the following account: ";
        while (iter.hasNext()) {
            out += "Account " + iter.next();
        }
        return out;
    }
}
