package Vasly_Review;

public class Employee {

	String firstName;
	String lastName;
	int employee_id;
	int age;
	float hourlyRate;
	char gender;
	boolean isInsured;
	String title;
	String email;
	String []titles = {"Developer", "Scrum master", "SDET", "PO", "QA Analyst","HR"};
	
	public void printInfo() {
		System.out.println("First name: "+ firstName + " Last name: "+ lastName+ 
				", Employee ID: "+employee_id+ ", Age: "+ age+ ",  Hourly Rate: "+
					hourlyRate+ ", Gender: "+gender+
				", Insured? "+isInsured+ " Job Title: "+title+ ", Email: "+ email);
	}
	public String createEmail() {
		String emailCreate = firstName.toLowerCase()+"_"+ lastName.toLowerCase()+ "@gmail.com";
		email = emailCreate;
		return emailCreate;
	}
	public void setEmail(String e) {
		if(e.contains("@")) {
			email = e;
		}else {
			System.out.println("Invalid email!");
	}
	}
	public void printEmail() {
		
		System.out.println("Email of "+firstName+ " "+ lastName+" : "+ email);
		
	}
	// this method will validate title before setting it.
	public void setJobTitle(String str) {
		boolean isValid = false;
		for(String t : titles) {
			if(t.equals(str)) {
				title= str;
				isValid = true;
			
			}
		}
		if(isValid == true) {
			System.out.println("Title was set successfully");
	}else{
		System.out.println("Invalid title!");
	}
	
		
		
		
		
		
		
	}	
}
