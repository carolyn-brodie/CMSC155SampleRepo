package week14;

public class BankAccount {
	
	//instance variables
	private String owner;
    private double balance;
	private int accountNum;

	
	//constructor
	public BankAccount(String owner, int num)   {
		this(owner, num,0);
	}
	
	
	public BankAccount(String owner, int num, double balance)   {

		this.owner = owner;
		accountNum = num;
		this.balance = balance; 
	}
	
	 
	
	
	//Return the balance
		public double getBalance() {
			 
			return balance;
		}
	
	
	
	
	//toString
	public String toString() {
		return "Account Number " + accountNum + ": $" + getBalance(); 
	}
	
	//deposit
	public void deposit(double amount)  
	{

		balance += amount;
	}
	
	//withdrawal
	public void withdraw(double amount)
	{
		if (balance > amount)
			balance -= amount;
	}
	

	
	//Return customer information
 

}