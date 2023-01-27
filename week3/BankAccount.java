package week3;

public class BankAccount {

    //instance variables
    private Person owner;
    private int accountNum;
    private double balance;

    //constructor
    public BankAccount(Person owner, int accountNum) {
        this.owner = owner;
        this.accountNum = accountNum;
        balance = 0;
    }



    //Deposit Method
    public void deposit(double amount) {
        balance += amount;
    }


    //Withdrawal Method
    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
    }

    //For Printing
    public String toString() {

        return owner + " has account " + accountNum + " with balance $" + balance;
    }

    public static void main(String[] args) {
        Person sam = new Person("Sam Jones", "111 First Street", "555-555-5555");
        BankAccount samAccount = new BankAccount(sam, 123);
        System.out.println(samAccount);
        samAccount.deposit(100);
        System.out.println(samAccount);
        samAccount.withdraw(10.25);
        System.out.println(samAccount);

        //BankAccount joeAccount = new BankAccount("Joe", 345, 100);
        //System.out.println(joeAccount);
    }
}
