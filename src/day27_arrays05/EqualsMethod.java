package day27_arrays05;

import java.util.Arrays;

public class EqualsMethod {

	public static void main(String[] args) {
		int [] num1 = {6, 5, 10, 80};
		int [] num2 = {6, 5, 10, 80};
		
		System.out.println(Arrays.equals(num1, num2));
		
		//Array arr1 
		if(Arrays.equals(num1, num2)) {
			System.out.println("They are exactly smae");
		}else {
			System.out.println("Mismatched values present");
		}
		
		
		String [] strArr1 = {"one", "two", "three"};
		String [] strArr2 = {"one", "two", "three"};
		System.out.println(Arrays.equals(strArr1, strArr2));
		
		if(Arrays.equals(strArr1, strArr2)){
			System.out.println("They are the same length and letters");
		}else {
			System.out.println("Not matching");
		}
		
		boolean match = Arrays.equals(strArr1, strArr2);
		System.out.println("Match: "+ match);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
}