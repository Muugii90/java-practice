package day07_scanner_operaters;
import java.util.Scanner;

public class ShoppingCart {


	  public static void main(String[] args) {
	    //WRITE YOUR CODE HERE:
	    
	    String item1, item2, item3, report;
	    double price1, price2, price3 , totalPrice;
	    
	    Scanner scanner = new Scanner (System.in);
	    
	    System.out.println( "Enter Item1 and its price:");
	    item1 = scanner.next();
	    price1 = scanner.nextDouble();
	    
	    System.out.println( "Enter Item2 and its price:");
	    item2 = scanner.next();
	    price2 = scanner.nextDouble();
	     
	    System.out.println( "Enter Item3 and its price:");
	    item3 = scanner.next();
	    price3 = scanner.nextDouble();
	    
	    totalPrice = price1 + price2 + price3;
	    
	    //report = item1 + item2 + item3;
	    
	    report ="Item1: " + item1 + " Price: " + price1+ ", Item2: " + item2 + " Price: " + price2 +", Item3: " + item3 + " Price: " + price3;
	    System.out.println(report);
	    System.out.println("Total price: " +totalPrice);
	    
	    
	    
	   // System.out.println ("Item2: \""+ item2 + "\" Price: \"" + price2 + "\"");
	   // System.out.println ("Item3: \""+ item3 + "\" Price: \"" + price3 + "\"");
	    
	    
}
}