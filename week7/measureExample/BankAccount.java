package week7.measureExample;

public class BankAccount  implements Measure{
	
	//instance variables (attributes)
	 
	private double balance;
	private String owner;
	private int accountNum;

	//constructor
	public BankAccount(String owner, int num) 
	{
		 
		this(owner, num, 0.0);
	}
	
	
	public BankAccount(String owner, int num, double initialBalance)
	{
		this.owner = owner;
		accountNum = num;
		balance = initialBalance;
	}
	
	//other methods
	public void deposit(int amount) 
	{
		balance += amount;
	}
	
	public void withdraw(int amount) 
	{
		if (balance >= amount) 
		{
			balance -= amount;
		} else 
		{
			System.out.println("Insufficint funds");
		}
	}

	public double getMeasure() {
		return balance;
	}

	 
	
	//toString method
	public String toString() 
	{
		String out = "Owner, " + owner;
		out = out + ", has balance " + balance + " dollars in account ";
		out = out + accountNum;
		return out;
	}

}
