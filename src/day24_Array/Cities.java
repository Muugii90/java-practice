package day24_Array;

public class Cities {

	public static void main(String[] args) {
		// declare the String variable 8 
		//Find "M" starts
		String[] cities = {"Washigton DC", "Mongolia", "Korea", "McLean",
							"Istanbul","Siler Spring","Baku", "Miami"};
		 int[] nums = {1,2,443,5};
	        // System.out.println(cities.length);
	        // TASK print all cities that start with M
	        for (int i = 0; i < cities.length; i++) {
	            if (cities[i].startsWith("M")) {
	                System.out.println(cities[i]);
	            }
	        }
//	      same thing, with for each loop
	        for(String city: cities) {
	            if (city.startsWith("M")) {
	                System.out.println(city);
	            }
	        }
	        
	        
	    }
	}
