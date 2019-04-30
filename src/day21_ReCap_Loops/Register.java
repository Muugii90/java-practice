package day21_ReCap_Loops;
import java.util.*;
public class Register {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

		String itemName="";
		double totalPrice = 0.0;
		
		
		System.out.println("How many items are you purchasing?");
		int itemNum = scan.nextInt();
		
		for(int i= 1; i <= itemNum; i++) {
			
			System.out.println("What is item "+i+"?");
			String item = scan.next();
			itemName = itemName + item+ ", ";
			
			System.out.println("How much is "+ item+ "?");
			double price = scan.nextDouble();
			totalPrice = totalPrice + price;
		}
		//item = item
	System.out.println("Your items "+ itemName);
	System.out.println("Your total Price "+ totalPrice);
	}

}
