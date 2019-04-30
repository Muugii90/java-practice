package day23_NestedLoops;

import java.util.Scanner;

public class WarmUpTask {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a number");
		int number;
		int count = 0;
		number = scan.nextInt();
		

		for(int i = 2; i<=number ; i++) {
			if(number%i ==0);
			count++;
		}
		if(count>1) {
			System.out.println("not prime");
		}else {
			System.out.println(number+"prime");
		}			
		
		
		
		
	}

}
