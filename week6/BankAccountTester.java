package week6;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount suzyAccount = new BankAccount("Suzy Q", 1234);
        System.out.println(suzyAccount);
        suzyAccount.deposit(100);
        suzyAccount.deposit(10);
        System.out.println(suzyAccount);
        suzyAccount.withdraw(10.10);
        System.out.println(suzyAccount);

        BankAccount bankVar = new SavingsAccount("Bear ", .15);



    }
}
