package day12_switch_ternary;
import java.util.*;
public class Calculator2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		 
	System.out.println("Enter first number: ");
	double num1 = scan.nextDouble();
	
	System.out.println("Enter second number: ");
	double num2 = scan.nextDouble();
	
	System.out.println("Select operator: + , - , * , / ,% ");
    String operator = scan.next();
    double result = 0.0;
    
    switch (operator) {
    case ("+"):
    	System.out.println(result = num1 + num2);
    break;
    case ("-"):
    	System.out.println(result = num1 - num2);
    break;
    case ("*"):
    	System.out.println(result = num1 * num2);
    break;
    case ("/"):
    	System.out.println(result = num1 / num2);
    break;
    case ("%"):
    	System.out.println(result = num1 % num2);
    break;
    default:
		System.out.println("Invalid operator selected");
    
    }

}
	}

