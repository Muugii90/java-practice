package day40_customClass_;

public class Contact {
	
	String name;
	String PhoneNumber;
	String email;
	
	public void call () {
		System.out.println("Call "+ name + "...");
	
	}
	public void phoneNumber() {
		System.out.println("Phone Number: " + PhoneNumber);
	}
	public void email() {
		System.out.println("Email address: " + email );
	}
	
}
