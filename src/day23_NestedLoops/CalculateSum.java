package day23_NestedLoops;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int sum = 0; 
		int number =0;
		scan.nextInt();
		
		for(int i = 0;  i<6; i++) {
		
				System.out.println("Enter a number");
				number = scan.nextInt();
				if(number<=0) {
					continue;
				}
				sum = sum+number;
		}
		System.out.println("Total sum "+ sum);
	}
	
	
}
