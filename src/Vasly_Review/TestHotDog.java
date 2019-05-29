package Vasly_Review;

import java.util.Scanner;

public class TestHotDog {

	public static void main(String[] args) {
		// this is our network of hot dog stands
		int cardNum = 0;
		String command = "";
		HotDogStand[] stands = new HotDogStand[3];
		stands[0] = new HotDogStand(0, 0);
		stands[1] = new HotDogStand(1, 0);
		stands[2] = new HotDogStand(2, 0);
		
		Scanner scan  = new Scanner (System.in);
		while(true) {
		System.out.println("Enter command: ");
			command = scan.next();
		if(command.equals("sold")) {
			System.out.println("Enter Card Number: ");
			cardNum = scan.nextInt();
			stands[cardNum].justSold();
		}else if(command.equals("print")) {
			System.out.println("Enter Cart Number: ");
			cardNum = scan.nextInt();
			System.out.println("Card sold: "+ stands[cardNum].getSold());
		}else if(command.equals("print-all")) {
			System.out.println("Total sold: "+ HotDogStand.getTotal());
		}else {
			return;
		}
	  }	
	}

}
