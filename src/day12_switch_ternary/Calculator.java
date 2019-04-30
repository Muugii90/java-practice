package day12_switch_ternary;
import java.util.*;
public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		 
	System.out.println("Enter first number: ");
	double num1 = scan.nextDouble();
	
	System.out.println("Enter second number: ");
	double num2 = scan.nextDouble();
	
	System.out.println("Select operator: + , - , * , / ,% ");
    String operator = scan.next();
    double result = 0.0;
    
    
    if (operator.equals("+")) {
    	result = num1 + num2;
    	
    }else if (operator.equals("-")) {
    	result = num1 - num2;
    	
    }else if (operator.equals("/")) {
    	result = num1 / num2;
    	
    }else if (operator.equals("*")) {
    	result = num1 * num2;
    	
	 }else if (operator.equals("%")) {
    	result = num1 % num2;
	 }else {
		 System.out.println("Invalid operator selected: "+ operator);
		 return;
	 }
    	System.out.println("Result: " + result);

}
	}

