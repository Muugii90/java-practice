package day11_logical_nested_if;
import java.util.*;
public class FindMidNumber {

	public static void main(String[] args) {
		 Scanner  scanner= new Scanner (System.in);
		    
		    int num1, num2, num3;
		    int value = 0 ;
		    
		    System.out.println("Enter first number:");
		      num1 = scanner.nextInt();
		    System.out.println("Enter second number:");
		      num2 = scanner.nextInt();
		    System.out.println("Enter third number:");
		      num3 = scanner.nextInt();
		      if (num1 > num2 && num1 > num3) {
		        if (num2 > num3){
		          value = num2;
		        }else {
		          value = num3;
		        } // if end
		        
		      }else if (num2 > num1 && num2 > num3){
		        if (num1 > num3){
		          value = num1;
		        }else {
		        	value = num3;
		        }// if end
		        
		      } else if (num3 > num1 && num3 > num2){
		        if (num1 > num2){
		          value = num1;
		        }else {
		          value = num2;
		        }
		     }
		           System.out.println ("Medium value is: "+ value);
		      
		           
		  }
	

	}


