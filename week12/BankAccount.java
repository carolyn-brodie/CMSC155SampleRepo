package week12;

import java.text.DecimalFormat;

class BankAccount implements Comparable<BankAccount>
{
	   private static double withdrawalFee = 0.05;
	   private double balance;
	   private String owner;

	   public BankAccount(String owner, double balance)
	   {
		   this.owner = owner;
		   this.balance = balance;
	   }
	   public String getOwner() {
		   return owner;
	   }

	   public double getBalance() {
		   return balance;
	   }

	   public void deposit(double amount)
	   {
		   if (amount > 0) this.balance += amount;
	   }

	   public void withdraw(double amount)
	   {
		   this.balance -= withdrawalFee;
		   if (amount <= this.balance) this.balance -= amount;
		   else System.out.println(this.owner + " tried to withdraw " + amount +
				   " but balance was insufficient: " + this.balance);
	   }

	   public int compareTo(BankAccount account)
	   { // Compare accounts using their owner's name - simpler version.
		return this.owner.compareTo(account.owner);
	   }

//       public int compareTo(BankAccount account)
//	   { // Compare bank-accounts by their balance,
//	     // and if the balance is the same then compare by owner's name.
//	   	if (this.balance > account.balance)
//	   	    return 1; // NOTE: Larger balances BEFORE smaller balances
//	   	else if (this.balance < account.balance)
//	   	    return -1;
//	   	else  // Balances are equal; compare owners.
//	   	    return this.owner.compareTo(account.owner);
//	   }

	   // If you want to compare objects in two different ways in the same program, you need
	   // separate comparison functions, as shown below. The comparison function is used 
	   // as a parameter to the sort method.
	   
        public int compareOwner(BankAccount account)
        {
            return this.owner.compareTo(account.owner);
        }

        public int compareBalanceThenOwner(BankAccount account)
        {
            if (this.balance > account.balance)
                return -1; // NOTE: Larger balances BEFORE smaller balances
            else if (this.balance < account.balance)
                return 1;
            else  // Balances are equal; compare owners.
                return this.owner.compareTo(account.owner);
        }

	public String toString()
	{
	    final DecimalFormat twoPlaces = new DecimalFormat("0.00");
	    return this.owner + " has a balance of " + "$" + twoPlaces.format(this.balance);
	}

}
