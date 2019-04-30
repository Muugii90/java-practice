package day24_Array;

import java.util.Arrays;// importing arrays

public class SumOfTheNumbers {

	public static void main(String[] args) {
		//creating an array integers with length 3
		int []numbers = new int [3];
		numbers [0]= 25;
		numbers [1]= 10;
		numbers [2]= 20;
		//System.out.println(numbers);// it will print a hash code
		// toString method works with only Array. It helps us to print an array as a string 
		System.out.println(Arrays.toString(numbers));
		
		int sum =0;
		for(int i =0; i <numbers.length  ; i++ ) {
			sum = sum + numbers [i];	
		}
		System.out.println("Sum is "+ sum);
		// find largest value in array
		
		int max = Integer.MIN_VALUE;
		//System.out.println(Integer.MIN_VALUE);
		for (int i = 0; i<= numbers.length;i++) {
			if(numbers [i]> max) {
				max = numbers[i];
			}
		}
		
		
		
		System.out.println(max);
		int min =Integer.MAX_VALUE;
		for(int i =0; i< numbers.length; i++) {
			
		}
		
	
	}

}
