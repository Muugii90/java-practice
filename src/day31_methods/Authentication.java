package day31_methods;

import java.util.Scanner;

public class Authentication {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String username1 = scan.next();
		String password1 = scan.next();
		login(username1, password1);
		
	}
	public static void login (String username, String password) {
		String validUsername = "mentoring@cybertekschool.com";
		String validPassword = "method001";
		
		
		if(username.equalsIgnoreCase(validUsername) && password.equalsIgnoreCase(validPassword)) {
			System.out.println("Login Successful, Welcome OKTA");
		}else {
			System.out.println("Sign in failed!");
		}
	}
}
