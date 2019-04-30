package day11_logical_nested_if;
import java.util.*;
public class Login {
public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	
	

	
	System.out.println("Enter your User Name: ");
	String username = input.next();
	
	System.out.println ("Enter your password: ");
	String password = input.next();
	
	String validUsername = "moogii.mogi@yahoo.com";
	String validPassword = "Moogii1990";
	
	
	if (username.equalsIgnoreCase(validUsername) && password.equals(validPassword)) {
		System.out.println("User name and Password are correct");
		//System.out.println("Login Successful, Welcome");
			
	}else if (!username.equalsIgnoreCase (validUsername) && !password.equals(validPassword))  {
		System.out.println("Invalid User Name and Invalid Password");
			
	}else if (!username.equals(validUsername) && password.equals(validPassword)) {
		System.out.println("Invalid Username");
		
	}else if (username.equals(validUsername) && !password.equals(validPassword)) {
		System.out.println("Invalid Password");
	
	
}
}
}