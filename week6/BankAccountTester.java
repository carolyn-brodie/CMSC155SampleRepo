package week6;

public class BankAccountTester {

    public static void doSomething(BankAccount acct) {
        System.out.println(acct.returnBalance());
        acct.printit();

    }
    public static void main(String[] args) {
        BankAccount suzyAccount = new BankAccount("Suzy Q", 1234);
        System.out.println(suzyAccount);
//        suzyAccount.deposit(100);
//        suzyAccount.deposit(10);
//        System.out.println(suzyAccount);
//        suzyAccount.withdraw(10.10);
//        System.out.println(suzyAccount);
        //System.out.println(suzyAccount.balance);

        BankAccount bankVar = new SavingsAccount("Bear ", .15);
        System.out.println(bankVar);
        bankVar.deposit(100);
        System.out.println(bankVar);
        //bankVar.payInterest();
//        System.out.println(bankVar);

//        doSomething(suzyAccount);
//        doSomething(bankVar);








    }
}
