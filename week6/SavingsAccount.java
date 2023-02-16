package week6;

public class SavingsAccount extends BankAccount{

    //Notice this is no longer static
    private double interestRate;

    public SavingsAccount(String owner, double interest) {
        super(owner);
        interestRate = interest;
    }

    public void printit() {
        System.out.println("Savings Account");
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 10);
    }

    public void payInterest() {
        //double amount = interestRate * balance;
        double amount = interestRate * super.returnBalance();
        super.deposit(amount);
    }

    @Override
    public String toString() {
        String out = super.toString();
        out += " with interest rate " + interestRate;
        return out;
    }


}
