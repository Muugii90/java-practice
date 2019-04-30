package day20_forLoops;

import java.util.Scanner;

public class MuliplicationTable {

	public static void main(String[] args) {
	
		Scanner  scan = new Scanner (System.in);
		System.out.println("Enter number");
		int num = scan.nextInt();
		int sum=0;
		if (num < 1 || num >10) {
			System.out.println("ERROR: Invalid input");
			System.exit(0);
		}
		for (int i = 1; i <= 10; i++) {
			sum = num * i;
			System.out.println(num + " x " +i +" = " + sum);// 
		
	}

}
}