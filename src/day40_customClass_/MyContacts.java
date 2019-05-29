package day40_customClass_;

public class MyContacts {

	public static void main(String[] args) {
		
		Contact contact1 = new Contact();
	
		contact1.name = "Tsoomoo";
		contact1.email = "tsoomoo_b@yahoo.com";
		contact1.PhoneNumber = "(202) 255-6677";
		
		contact1.call();
		contact1.email();
		contact1.phoneNumber();
		
		Contact orhon = new Contact ();
		orhon.name = "Orhan Sultanov";
		orhon.PhoneNumber = "(202) 555 - 6666";
		orhon.email = "orhan@gmail.com";
		
		
		System.out.println("Name : "+ orhon.name);
		System.out.println("PhoneNumber: "+ orhon.PhoneNumber);
		System.out.println("Email: "+ orhon.email);
		orhon.call();
		orhon.email();
		orhon.phoneNumber();
		
		contact1.call();
		
		
	}

}
