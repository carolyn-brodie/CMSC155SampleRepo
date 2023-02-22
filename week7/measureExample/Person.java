package week7.measureExample;

public abstract class Person {
	
	private String name;
	private String address;
	
	public Person(String name, String add) {
		this.name = name;
		address = add;
	}
	
	public abstract void findJob();
	public abstract String formatAddress();
	
	public void updateName(String newName) {
		name = newName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public boolean equals(Object object) {
		if (object instanceof Person) {
			Person otherPerson = (Person) object;
			return (name.equals(otherPerson.name) &&
					address.equals(otherPerson.address));
		} else 
			return false;
	}
	
	public String toString() {
		return name + " " + address;
	}
}
