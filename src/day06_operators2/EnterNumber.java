package day06_operators2;

import java.util.Scanner;

public class EnterNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);// Create Scanner object
		System.out.println("Enter a number: ");
		
		int number = scan.nextInt();
		System.out.println("You entered: " +number );
		
		
		Scanner input = new Scanner (System.in);
		System.out.println("Please enter your name:");
		
		String firstName = input.next();
		System.out.println("Nice to meet you, "+ firstName);
		
		
	}

}
