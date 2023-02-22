package week7.measureExample;

public class Employee extends Person    {
	
	private String jobTitle;
	private double salaryPerMonth;
	
	public Employee(String name, String add, String jobTitle, double salary) {
		super(name, add);
		this.jobTitle = jobTitle;
		salaryPerMonth = salary;
		
	}


	 
	
	public void findJob() {
		System.out.println("Put the job here");
	}
	public String formatAddress() {
		String add =  super.getAddress();
		return add;
	}
	
	 
	 

}
