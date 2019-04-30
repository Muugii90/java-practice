package day31_methods;

import java.util.Scanner;

import day30_method.*;

public class Tests {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String a=scan.next();
		int b=scan.nextInt();
		Calculater.add(23,45); // call add method from Calculate class
		Calculater.multiply(23,45);
		Drive.drive(a, b);
		Authentication.login("mentoring@cybertekschool.com", "method001" );
		
		MyNumbers.showMe5Numbers(); // random
		
		
	}

}
