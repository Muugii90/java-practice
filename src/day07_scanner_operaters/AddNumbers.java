package day07_scanner_operaters;

import java.util.Scanner;

public class AddNumbers {
	public static void main (String []args) {
		
		int num1, num2, num3, sum;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println ("Enter 3 numbers:");
		num1 = scanner.nextInt();
		num2 = scanner.nextInt();
		num3 = scanner.nextInt();
		
		sum = num1 - num2 - num3;
		
		System.out.println("Sum of numbers: " + sum);
		
	}
	

}
