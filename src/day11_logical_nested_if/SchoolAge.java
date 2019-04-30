package day11_logical_nested_if;
import java.util.*;
public class SchoolAge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    //WRITE YOUR CODE HERE 
	    Scanner scan1 = new Scanner(System.in);
	    //WRITE YOUR CODE HERE 
	    System.out.println ("Enter age:");
	    int age = scan1.nextInt ();
	    
	    if (age < 2 || 18 < age){
	      System.out.println ("ineligible");
	    }else if (age == 2){
	      System.out.println ("toddler");
	    }else if (age >= 3 &&  age <= 5 ){
	      System.out.println ("early childhood");
	    }else if (age >= 6 && age <=7){
	      System.out.println ("young reader");
	    }else if (age >= 8 && age <=10){ 
	      System.out.println ( "elementary");
	    }else if (age ==11 && 12 ==age){
	      System.out.println ("middle");
	    }else if (age ==13){
	      System.out.println ("impossible");
	      
	    }else if (age >=14 && age <=16){
	      System.out.println ( "high school");
	      
	    }else if (age ==17 || 18 ==age){
	      System.out.println ("scholar");
	  
	  }
	    
	  }
	}
