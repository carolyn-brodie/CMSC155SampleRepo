package week11.setsMaps;

public class BankTester {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount("Suzy", 123, 10.10);
        BankAccount acct2 = new BankAccount("Suzy", 123, 10.13);

        System.out.println("acct1 hashcode " + acct1.hashCode());
        System.out.println("acct1 hashcode " + acct2.hashCode());
    }
}
