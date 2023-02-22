package week7.measureExample;

public class DataSetTester {

	public static void main(String[] args) {
	 
		BankAccount[] accountArray = {new BankAccount("Suzy", 123,1000), new BankAccount("Sam", 3435,1205.23),new BankAccount("Joe", 987, 456)};
		DataSet bankAccountSet = new DataSet(accountArray, "Banker's Trust", "Account balances");
		System.out.println(bankAccountSet.findAverage());

		bankAccountSet.printDataStatisticsReport();
		System.out.println(bankAccountSet);
//		
//		
		Book[] bookArray = {new Book("book1", "author1", 25.43), new Book("book2", "author2", 14.14), new Book("book3", "author3",120.)};
//		DataSet bookSet = new DataSet(bookArray, "Barnes and Noble", "Book Prices");
//		bookSet.printDataStatisticsReport();

		Employee[] employeeArray = {new Employee("Mary", "123 First Street", "programmer", 5000), new Employee("Tom", "345 Second Street", "Analyst", 6000)};
//		DataSet employeeSet = new DataSet(employeeArray, "Computer1", "Salaries");
//		employeeSet.printDataStatisticsReport();
		
	}

}
