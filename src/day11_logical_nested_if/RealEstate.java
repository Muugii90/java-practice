package day11_logical_nested_if;
import java.util.*;
public class RealEstate {
  public static void main(String[] args) {
    //DO NOT CHANGE
    int propertyPrice = 0; 
		int numberOfBedrooms, garageSpots;
		float metroAccessibility, schoolScore, highwayAccessibility;
		boolean backyard, smoking, garage;
		String houseType;
		Scanner scan = new Scanner(System.in);
		System.out.println("*****************************************");
		System.out.println("* Welcome to the RealEstate calculator! *");
		System.out.println("*****************************************");
    //WRITE YOUR CODE HERE
    
		System.out.println("Enter your property type:");
	      houseType = scan.nextLine();
	      if (houseType.equalsIgnoreCase ("Condo")){
	        propertyPrice = propertyPrice + 50000;
	        System.out.println("test "+ propertyPrice);
	      }else if (houseType.equalsIgnoreCase ("Townhouse")){
	        propertyPrice = propertyPrice + 75000;
	        System.out.println("test "+ propertyPrice);
	      }else if (houseType.equalsIgnoreCase ("Single Family")){
	        propertyPrice = propertyPrice + 95000;
	        System.out.println("test "+ propertyPrice);
	      }
	      
	    System.out.println("How many bedrooms do you have?");
	      numberOfBedrooms = scan.nextInt();
	      propertyPrice= propertyPrice + numberOfBedrooms * 30000;
	      System.out.println("test "+ propertyPrice);

	    System.out.println ("Do you have a backyard?");
	      backyard = scan.nextBoolean();
	      if (backyard && !houseType.equalsIgnoreCase ("Condo")){
	      propertyPrice = propertyPrice + 5000;
	      System.out.println("test "+ propertyPrice);
	     } else if (backyard && houseType.equalsIgnoreCase ("Condo") ){
	    System.out.println(" Backyard is not available for condo!");
	    System.out.println("test "+ propertyPrice);
	    }
	    
	    System.out.println ("Do you have garage?");
	      garage = scan.nextBoolean();
	      
	      if (garage){
	     System.out.println ("How many spots?");
	      garageSpots = scan.nextInt();
	      
	      if (garageSpots < 10 ){
	        propertyPrice = propertyPrice + (garageSpots * 20000);
	       
	        
	    } else if (garageSpots > 10 ){
	      System.out.println ("Pardon,  it's not a public parking!");
	    }
	      
	    System.out.println ("How close is metro station?");
	      metroAccessibility = scan.nextFloat();
	      if (metroAccessibility < 1){
	        propertyPrice = (int)( propertyPrice + 10000);
	        System.out.println("test "+ propertyPrice);
	        
	      }else if (metroAccessibility >= 1 && metroAccessibility <= 3)
	         propertyPrice = (int) (propertyPrice + 5000);
	      System.out.println("test "+ propertyPrice);
	      }
	    System.out.println ("How close is highway?");
	    highwayAccessibility = scan.nextFloat();
	    
	    if (highwayAccessibility <= 1){
	      propertyPrice = (int) (propertyPrice + 15000);
	      System.out.println("test "+ propertyPrice);
	    }else if (highwayAccessibility >= 1 &&  highwayAccessibility <=5){
	      propertyPrice = (int) (propertyPrice + 8000);
	      System.out.println("test "+ propertyPrice);
	      
	    } else if ( highwayAccessibility >= 5 &&  highwayAccessibility <= 20){
	    propertyPrice = (int) (propertyPrice + 4000);
	    System.out.println("test "+ propertyPrice);
	  }
	    System.out.println ("What's the rating of nearest school?");
	    schoolScore = scan.nextFloat();
	    if (schoolScore >= 8 && schoolScore <= 20){
	    propertyPrice = propertyPrice + 45000;
	    System.out.println("test "+ propertyPrice);
	    }else if (schoolScore < 8 && schoolScore >=4) {
	    propertyPrice = propertyPrice + 20000;
	    System.out.println("test "+ propertyPrice);
	    }else 
	    propertyPrice = propertyPrice + 5000;{
	    	 System.out.println("test "+ propertyPrice);
	    System.out.println ("Does any of your family members smoking?");
	    smoking = scan.nextBoolean();
	    if (smoking)
	    propertyPrice = propertyPrice - 5000;
	    System.out.println("test "+ propertyPrice);
	    
	    System.out.println("Market report has been generated.");
	    System.out.println ("Your estimate market price is: "+ propertyPrice +"$");
	  }
	    }
	}