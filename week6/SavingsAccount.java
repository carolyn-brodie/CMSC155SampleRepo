package week6;

public class SavingsAccount extends BankAccount{

    //Notice this is no longer static
    private double interestRate = .1;

    public SavingsAccount(String owner, double interest) {
        super(owner);
        interestRate = interest;
    }


}
