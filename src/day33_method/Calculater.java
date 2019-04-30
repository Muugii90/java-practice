package day33_method;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		addMethod(20,50);
		System.out.println("Sum: "+ add(30,20));
		System.out.println("Minus: "+ minus(10, 1));
		System.out.println("Divide: "+divide(10,5));
		System.out.println("Minus: "+minus(10, 5));
		System.out.println("Multiply:"+multiply(2,8));
		//add(40,60);
		int num = scan.nextInt();
		int num1 = scan.nextInt();
	}	
	public static void addMethod(int num1, int num2) {
		
		int result = num1+ num2;
		System.out.println("Result: "+result);

	}
	public static int add(int num3, int num4) {
		
		int sum = num3 + num4;
		return sum;
	}
	public static int multiply(int num, int num1) {
		int sum = num*num1;
		return sum;
	}
	public static int minus(int num, int num1) {
		int sum = num - num1;
		return sum;
	}
	public static int divide(int num, int num1) {
		if(num1==0) {
			System.out.println("Error Can not divide by 0");
			//System.exit(0);
		}
		int sum = num /num1;
		return sum;
	}
		
}
