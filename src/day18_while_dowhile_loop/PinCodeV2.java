package day18_while_dowhile_loop;

import java.util.Scanner;

public class PinCodeV2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int secretPincode = 4321;
		int pincode = 0;
		int attempts = 0;
		boolean stop = true;
		
		while (pincode != secretPincode && attempts <= 3 ) {
			System.out.println("Enter pincode");
			pincode = scan.nextInt();
			attempts++;
			
			if (attempts == 3 && pincode != secretPincode) {
				System.out.println("Card is blocked");
				return;
		}
			
		}
		System.out.println("Access granted. Select operation");
	}

}
