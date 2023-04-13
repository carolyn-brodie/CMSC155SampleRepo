package week12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingInJava
{
	public static void main(String[] args) 
	{
	 	// Sorting array-lists.

		final Integer[] mixedOrder = {3, -55, -7, 7, 0, -2, 54, 7};
//		Arrays.sort(mixedOrder);
//		System.out.println(Arrays.toString(mixedOrder));
//
//		// Increasing order is the default.
		List<Integer> increasingOrder = new ArrayList<>(Arrays.asList(mixedOrder));
		Collections.sort(increasingOrder);
		System.out.println(increasingOrder);
//
//		// Obtain decreasing order using Collections.reverseOrder.
		List<Integer> decreasingOrder = new ArrayList<>(Arrays.asList(mixedOrder));
		Collections.sort(decreasingOrder, Collections.reverseOrder());
		System.out.println(decreasingOrder);
//
//		// Even numbers before odd numbers.
		List<Integer> evensFirst = new ArrayList<>(Arrays.asList(mixedOrder));
		Collections.sort(evensFirst, (a,b) -> { if (a % 2 != 0 && b % 2 == 0) return 1; else return -1; });
		System.out.println(evensFirst);
//
//		// Even numbers in INCREASING order, followed by odd numbers in DECREASING order.
//		List<Integer> evensIncreasingOdddsDecreasing = new ArrayList<>(Arrays.asList(mixedOrder));
//		Collections.sort(evensIncreasingOdddsDecreasing,
//				(a,b) -> { if ((a % 2 != 0 && b % 2 == 0) ||
//					           (a % 2 == 0 && b % 2 == 0 && a > b) ||
//					           (a % 2 != 0 && b % 2 != 0 && a < b)) return 1; else return -1; });
//		System.out.println(evensIncreasingOdddsDecreasing);
//
//		// Arrays or Array-lists of objects are sorted using the compareTo function of the class.
//
//		String[] strings = {"owner", "balance", "bank", "account"};
//		Arrays.sort(strings);
//	 	System.out.println(Arrays.toString(strings));
//		// An array of Strings is sorted by default in the order specified by the compareTo method.
//
//	 	// To sort objects of some other class, the class can implement the Comparable interface; i.e. have a compareTo method.
//
//	 	BankAccount tomAccount = new BankAccount("Tom", 10);
//	 	BankAccount samAccount = new BankAccount("Sam",10);
//	 	BankAccount suzyAccount = new BankAccount("Suzy",10);
//	 	BankAccount bobAccount = new BankAccount("Bob",10);
//	 	BankAccount timAccount = new BankAccount("Tim",10);
//	 	BankAccount boffinAccount = new BankAccount("Boffin",10);
//
//	 	BankAccount[] accounts = {tomAccount,samAccount,suzyAccount,bobAccount,timAccount,boffinAccount};
//
//	 	suzyAccount.deposit(30);
//	 	tomAccount.deposit(10);
//	 	timAccount.deposit(10);
//
//	 	Arrays.sort(accounts); // Objects will be sorted according to the compareTo method in the class.
//	 	System.out.println("Array\n" + Arrays.toString(accounts));
//
//	 	List<BankAccount> accountsList = new ArrayList<>(Arrays.asList(accounts));
//	 	Collections.sort(accountsList); // Objects will be sorted according to the compareTo method in the class.
//	 	System.out.println("ArrayList\n" + accountsList);
//
//	 	// There can only be one compareTo method in any class.
//	 	// So what do you do if you need to sort objects from a certain class in 2 different ways?
//	 	// Pass the comparison function as a 2nd argument to the sort method.
//
//	 	System.out.println("\nArray");
//	    Arrays.sort(accounts, (first, second) -> first.compareOwner(second)); // Sort by owner's name.
//	    System.out.println(Arrays.toString(accounts));
////
//	    Arrays.sort(accounts, (first, second) ->  first.compareBalanceThenOwner(second));
//	    // Sort by balance; if balances are the same, sort by owner's name.
//	    System.out.println(Arrays.toString(accounts));
//
//	    System.out.println("Owner");
//	    Collections.sort(accountsList, (first, second) -> first.compareOwner(second)); // Sort by owner's name.
//	    System.out.println(accountsList);
//
//		System.out.println("Balance and then owner");
//	    Collections.sort(accountsList, (first, second) ->  first.compareBalanceThenOwner(second));
//	    // Sort by balance; if balances are the same, sort by owner's name.
//	    System.out.println(accountsList);

	}

}