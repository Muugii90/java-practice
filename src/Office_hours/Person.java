package Office_hours;

public class Person {
	
	private String firstname;
	private String lastName;
	private String birthday;
	
	
	//the constructor
	public Person(String bday){
		System.out.println("constucting");
		birthday = bday;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthday() {
		return birthday;
	}
	
	
	
}
