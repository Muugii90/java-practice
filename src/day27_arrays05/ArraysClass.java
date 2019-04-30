package day27_arrays05;
import java.util.*;
public class ArraysClass {

	public static void main(String[] args) {
		int []nums = {43,12,4,1,3,5};
		
		System.out.println(Arrays.toString(nums));
		
		String str = Arrays.toString(nums);
		System.out.println(str);
		//sort arrays in ascending order
		
		Arrays.sort(nums);
	System.out.println(Arrays.toString(nums));// sorting string 
	
	String [] languages = {"Zulu", "Spanish", "Polish", "Arabic", "Mongolia"};
	
	System.out.println(Arrays.toString(languages));
	//After sorted
	Arrays.sort(languages);
	System.out.println(Arrays.toString(languages));
	
	// numbers ==> UPPERCASE ==> lowercase
	// 123 ABC abc
	
	
	int [] nums2 = {22, 55, -89, 45, 76, 100, 123};
	System.out.println(Arrays.toString(nums2));
	Arrays.sort(nums2);
	int lowest = nums2[0];
	int largest = nums2 [nums2.length -1];
	System.out.println("Lowest num: "+ lowest);
	System.out.println("Largerst num: "+ largest);
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
