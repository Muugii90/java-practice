package day21_ReCap_Loops;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int sum = 0;
		do {
		System.out.println("Enter 2 numbers: ");
		int num = scan.nextInt();
		int num1 = scan.nextInt();
		
		sum = num + num1;
		}while (sum <= 100);
		
			System.out.println("Good Numbers "+ sum);
		}
		
	}


