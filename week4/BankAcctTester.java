package week4;

public class BankAcctTester {
    public static void main(String[] args) {
//        BankAccount acct = new BankAccount("Tommy",50.0);
//        System.out.println(acct);
//        acct.deposit(10);
//        acct.withdraw(1);
//        System.out.println(acct);
        BankAccount suzyAcct = new BankAccount("Suzy",1234,100.0);
//        System.out.println(suzyAcct);
//        System.out.println(BankAccount.returnNumberOfAccounts());
//        suzyAcct.withdraw(10);
//        System.out.println(suzyAcct);
//        BankAccount.updateFee(.10);
//        suzyAcct.withdraw(1);
//        System.out.println(suzyAcct);
//        System.out.println(suzyAcct.balance);


        BankAccount suzyAcct2 = new BankAccount("Suzy",1234,100.0);
        BankAccount suzyAcct3 = suzyAcct;
        BankAccount suzyAcct4 = suzyAcct.copy();

        System.out.println(suzyAcct);
        System.out.println(suzyAcct2);
        System.out.println(suzyAcct3);
        System.out.println(suzyAcct4);

        suzyAcct.withdraw(50);

        System.out.println(suzyAcct);
        System.out.println(suzyAcct2);
        System.out.println(suzyAcct3);
        System.out.println(suzyAcct4);
//        System.out.println(suzyAcct.equals(suzyAcct2));
//        System.out.println(suzyAcct == suzyAcct2);
    }
}