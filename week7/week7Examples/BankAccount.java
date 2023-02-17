package week7.week7Examples;

public class BankAccount {

    private static int nextNum = 100;
    //attributes
    private String owner;
    private int accountNum;
    private double balance;

    //constructor
    public BankAccount(String owner, int acct) {

        this(owner,acct,0);
    }

    public BankAccount(String owner, int acct, double balance) {
        this.owner = owner;
        accountNum = acct;
        this.balance = balance;
    }

    public BankAccount(String owner) {
        this(owner, nextNum++,0);
    }


    //other methods
    public void deposit(double amount) {
        balance += (amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount)
        {
            balance -= amount;
        }
        else
        {
            System.out.println("Insufficient funds");
        }
    }



    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount otherAcct = (BankAccount) obj;
            return owner.equals(otherAcct.owner) &&
                    accountNum == otherAcct.accountNum &&
                    balance == otherAcct.balance;
        } else return false;
    }

    public BankAccount copy() {
        return new BankAccount(owner, accountNum, balance);
    }

    //print methods
    @Override
    public String toString() {
        String out = owner + " with account " + accountNum;
        out += " has balance " + balance;
        return out;
    }



}
