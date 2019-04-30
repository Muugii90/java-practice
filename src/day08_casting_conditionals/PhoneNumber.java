package day08_casting_conditionals;
import java.util.Scanner;

public class PhoneNumber {
 public static void main (String []args) {
	 	
	  int areaCode, localNumber;
	  Scanner phone = new Scanner (System.in);
	    
	   System.out.println ("Enter your are code:");
	   areaCode = phone.nextInt();
	    
	   System.out.println("Enter local number");
	   localNumber = phone.nextInt();
	  
	   String phoneNumber = "("+areaCode+ ")-" + localNumber;
	   System.out.println("Calling number "+phoneNumber);    
	   
	  
 }
}
