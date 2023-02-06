package week4;

public class BankAccount {

    //static attributes
    public static final int QUARTER = 25;
    private static double bankingFee = 0.5;
    private static int nextID  = 100;
    private static int numberOfAccounts = 0;

    //Attributes
    private String owner;
    private double balance;
    private int account;

    //constructor
    public BankAccount(String owner, int account) {
        this.owner = owner;
        balance = 0;
        this.account = account;
        numberOfAccounts++;
    }

    public BankAccount(String owner, int account, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.account = account;
        numberOfAccounts++;

    }

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        this.account = nextID++;
        numberOfAccounts++;

    }

    public static void updateFee(double newFee) {
        bankingFee = newFee;


    }

//    public void collectMonthlyFee() {
//        this.withdraw(bankingFee);
//    }


    public static int returnNumberOfAccounts() {
        return numberOfAccounts;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount otherAcct = (BankAccount) obj;
           return this.owner.equals(otherAcct.owner)  &&
                   this.account == otherAcct.account &&
                   this.balance == otherAcct.balance;
        } else {
            return false;
        }
    }

    public BankAccount copy() {
        return new BankAccount(owner, account, balance);
    }


    //other methods
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount + bankingFee <= balance)
        {
            balance -= amount + bankingFee;
        }
        else
        {
            System.out.println("Insufficent funds");
        }
    }

    //Print
    public String toString() {

        return owner  + " has account " + account + " with balance " + balance;
    }

}


