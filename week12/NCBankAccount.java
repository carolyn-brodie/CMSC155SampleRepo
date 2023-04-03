package week12;

/**
 * Created by Owner on 4/17/2017.
 */

public class NCBankAccount  {

    //instance variables
    private String owner;
    private double balance;

    //constructor
    public NCBankAccount(String owner, double bal) {
        this.owner = owner;
        balance = bal;
    }


    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println ("Insufficient Funds");
    }

//    public int compareTo(NCBankAccount other) {
//        return owner.compareTo(other.owner);
//    }

    public String toString() {
        return owner + " has balance " + balance;
    }
}
