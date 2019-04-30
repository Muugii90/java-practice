package day31_methods;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter 1 number");
		double num1 = scan.nextDouble();
		System.out.println("Enter 2 number");
		double num2 = scan.nextDouble();
		
		add(num1, num2);
		substract(num1, num2);
		multiply(num1, num2);
		divide(num1, num2);
		remainder(num1, num2);
	}
	
	public static void add(double num1, double num2) {
		
	double result = num1+ num2;
	System.out.println("Add "+result);
		
	}
	public static void substract(double num1, double num2 ) {
		double result = num1- num2;
		System.out.println("Substract "+result);
	}
	public static void multiply (double num1, double num2 ) {
		double result = num1 * num2;
		System.out.println("Multiply "+result);
	}
	public static void divide(double num1, double num2 ) {
		if(num2 ==0) {
			System.out.println("Can not divide by 0");
		}
		double result = num1 /num2;
		
		System.out.println("Divide "+result);
}
	public static void remainder(double num1, double num2 ) {
		double result = num1% num2;
		System.out.println("Remainder: "+ result);
	}
}
