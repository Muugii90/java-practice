package day31_methods;

import java.util.Scanner;

public class Void_Methods {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		countUp(num);
		countDown(num);
		
	}
	public static void countUp (int n) {
		if(n < 1) {
			System.out.println("invalid input");}
		for (int i =1; i <=n; i++) {
				System.out.print(i+" ");}			
		System.out.println();
	}
	public static void countDown(int n) {
		if(n==1) {
			System.out.println("invalid input");}
		for (int i = n; i > 0; i--) {
				System.out.print(i+ " ");
		}
	
	}
	
	}
	
	
	

