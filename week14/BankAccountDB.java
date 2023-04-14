package week14;


import java.sql.ResultSet;
import java.sql.SQLException;

public class BankAccountDB {

	//instance variables
	private DataConnection db;
	private int accountNum;


	//constructor
	public BankAccountDB(int acctNum) {
		accountNum = acctNum;
		try {
			db = new DataConnection();
			String query = "SELECT Owner FROM Accounts WHERE Account_Num = " + accountNum;
		} catch (Exception e) {
			System.out.println("Connection failed " + e);
		}
	}

	public BankAccountDB(String owner)  throws Exception {

		this(owner,0);
	}


	public BankAccountDB(String owner, double balance) throws Exception {
		db = new DataConnection();
		getNextAcct();
		addRecord(owner, balance);
	}

	private void getNextAcct() {
		String query = "SELECT MAX(Account_num) as Largest FROM Accounts";
		System.out.println(query);
		try {
			ResultSet  result = db.runQuery(query);
			if (result.next()) {
				accountNum = result.getInt("Largest") + 10;
				System.out.println(accountNum);
			}
			result.close();
		} catch (Exception e) {
			System.out.println("Database error " + e);
		}
	}
	
	private void addRecord(String owner, double balance) {
		String query = "INSERT INTO Accounts(Account_num, Owner, Balance) VALUES(";
		query +=  accountNum + ",'" + owner + "'," + balance + ")";
		System.out.println(query);
		try {
			db.updateData(query);
		} catch (Exception e) {;
			System.out.println("Database error " + e);
		}
	}


	private String getOwner() {
		String owner = "";
		ResultSet result = null;
		String query = "SELECT Owner FROM Accounts WHERE Account_Num = " + accountNum;
		try {
			result = db.runQuery(query);
			if (result.next())
				owner = result.getString("Owner");
			result.close();
		} catch (SQLException e) {
			System.out.println("Error " + e);
		}
		return owner;
	}
	
	
	
	//toString
	public String toString() {
		return getOwner() + " has "  + " account Number " + accountNum + ": $" + getBalance();
	}
	
	//deposit
	public void deposit(double amount) throws SQLException  {
		//balance += amount;
		String query = "UPDATE Accounts SET Balance = Balance +" + amount;
		query = query + " WHERE Account_Num = " + accountNum;

		db.updateData(query);
	}

	
	//withdrawal
	public void withdraw(double amount)
	{
//		if (balance > amount)
//			balance -= amount;


	}

	//Return the balance
	public double getBalance() {
		double balance = 0;
		ResultSet result = null;
		String query = "SELECT Balance FROM Accounts WHERE Account_Num = " + accountNum;
		try {
			result = db.runQuery(query);
			if (result.next())
				balance = result.getDouble("Balance");
			result.close();
		} catch (SQLException e) {
			System.out.println("Error " + e);
		}
		return balance;
	}
	

 

}