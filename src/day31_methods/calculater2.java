package day31_methods;

import java.util.Scanner;

public class calculater2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter 1 number");
		double num1 = scan.nextDouble();
		System.out.println("Enter 2 number");
		double num2 = scan.nextDouble();
		
		System.out.println("Select operation: '+', '-', '*', '/', '%' ");
		String operater = scan.next();
		switch (operater) {
		case "+":
			Calculater.add(num1,num2);
		break;
		case "-":
			Calculater.substract(num1, num2);
		break;
		case "*":
			Calculater.multiply(num1, num2);
		break;
		case "/":
			Calculater.divide (num1, num2);
		break;
		case "%":
			Calculater.remainder(num1, num2);
		break;
		default: 
			System.out.println("Invalid");
		}
		
	}

}
