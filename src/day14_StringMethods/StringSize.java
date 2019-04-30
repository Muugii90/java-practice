package day14_StringMethods;

public class StringSize {

	public static void main(String[] args) {
		String str1 = "Good Mornig";
		if (str1.equals("Good Mornig")) {
			System.out.println("Match");
		}else {
			System.out.println("Not Match");
		}
		
		if (str1.equalsIgnoreCase ("good mornig")) {
			System.out.println("Match - ignore case");
		}else {
			System.out.println("Not Match - ignore case");
		}
		System.out.println(str1.toUpperCase());
		System.out.println(str1);
		str1 = str1.toUpperCase();
		System.out.println("After assignment: "+ str1);
		
		//combine the above methods together:
		if (str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
		}else {
			System.out.println("Chained methods : not match");
		}
		
		String name = "Munkhnasan";
		System.out.println(name.length());
		
		int lenght = name.length();
		System.out.println("My name's length: "+ lenght);
		
		//username must be exactly 8 characters.
		String userName = "Mongolia";
		if (userName.length() == 8) {
		 System.out.println("Valid username");
		}else {
			System.out.println("Invalid username");
		}
		String password = "woodenSpoon";
		if (password.length() >= 6) {
			System.out.println("Valid password");
		}else {
			System.out.println("Password is too short");
		}
		int passwordLenght = password.length();
		if(passwordLenght <= 6 ) {
			System.out.println("Invalid password. Too short");
		}else {
			System.out.println("Valid password, good job. ");
		}
		}
	}


