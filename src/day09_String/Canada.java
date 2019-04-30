package day09_String;
import java.util.*;
public class Canada {

	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("What is the capital of Canada?");
		
		String capital = scan.nextLine();//??????????????????????????????????????????
	
		if (capital.equalsIgnoreCase("Ottawa")) { // IgnoreCase method of String, does not care UPPERCASE or lowercase
		System.out.println("Your answer is correct!"); 
		} else { 
			System.out.println("Your answer is incorrect!"+capital+" is not capital of Canada!"); // (month.equals(month2)); // use this way
		}
		
		
	}
}
