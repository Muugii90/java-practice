package day24_Array;

import java.util.Arrays;

public class Cities {

	public static void main(String[] args) {
		// declare the String variable 8 
		//Find "M" starts
		
//		int[] nums= {1,2,3,9,12,4,5,6};
//		
//		
//		int temp2 = nums[0];
//		for(int i=0; i<nums.length-1; i++) {
//			nums[i]=nums[i+1];
//		}
//		nums[nums.length-1]= temp2;
//		
//		System.out.println("1: "+Arrays.toString(nums));
//		
//		for(int i=0;i<nums.length/2; i++) {
//			int temp=nums[i];
//			nums[i]=nums[nums.length-(i+1)];
//			nums[nums.length-(i+1)]=temp;
//		}
//		System.out.println("2: "+Arrays.toString(nums));
		
		int[] nums = {1,2,3};
		int[] reverse = new int[3];
		
		for (int i=nums.length-1; i>=0; i--) {
			reverse[0]=nums[i];
			//i++;
			//0         2
			//1         1
			//2         0
			    
			    
			  }
			  System.out.println(Arrays.toString(reverse));
			  
			
			
		//System.out.println("3: "+Arrays.toString(nums));
//		String[] cities = {"Washigton DC", "Mongolia", "Korea", "McLean",
//							"Istanbul","Siler Spring","Baku", "Miami"};
//		 int[] nums = {1,2,443,5};
//	        // System.out.println(cities.length);
//	        // TASK print all cities that start with M
//	        for (int i = 0; i < cities.length; i++) {
//	            if (cities[i].startsWith("M")) {
//	                System.out.println(cities[i]);
//	            }
//	        }
////	      same thing, with for each loop
//	        for(String city: cities) {
//	            if (city.startsWith("M")) {
//	                System.out.println(city);
//	            }
//	        }
//	        
//	        
	    }
	}
