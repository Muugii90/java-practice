package day21_ReCap_Loops;

import java.util.Scanner;

public class HomworkShoppingList1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		
		do{
			System.out.println("Enter Item"+count+ " and its price:");
			item = scan.next();
			price = scan.nextDouble();
			shoppingListReport =shoppingListReport + item;
			totalPrice = totalPrice + price;
			
			System.out.println("Add one more item?");
			countinue = scan.next();
			count++;
			
		}while(countinue.equals("yes")&&count <= 10);
			if(countinue.equals("no")) {
				System.out.println("Item "+count+item +" Price: "+price+ "Item "+ item+" Price: "+price);
				System.out.println("Total price: "+ totalPrice);
			}
		
		
		
	}
	


}


