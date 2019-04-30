package day34_ArraysList_Intro;

import java.util.Arrays;
import java.util.Random;

public class CountArray {

	public static void main(String[] args) {
		
		
		
		int[] nums = {2,3,4,5,5,6,6,6,7,5,5,12};
	    //1. with Print return right away
		System.out.println(findOccurences(nums, 5));
		System.out.println(findOccurences(nums, 6));
		//2. assign return value into a variable
		
		int five = findOccurences(nums, 5);
		System.out.println("5 values: " + five);
		System.out.println("Counting 20: "+findOccurences(new int [] {20,20,20,12,87},20));
		
		System.out.println(Arrays.toString(getRandomArray(10)));
		//for(;;) {
			System.out.println(Arrays.toString(getRandomArray(30)));
		
	}
	/*
	Class CountArray
	Method findOccurences
	Return type: int
	Params. int[] array, int value
	Method will look for value in the array 
	and return the count of occurences
	 */
	public static int findOccurences(int[] array, int value ) {
		int counter = 0;
		for(int num : array) {
			if(num == value) {
				counter++;
			}
		}
		return counter;
	} 
	public static int[]getArray(){
		int []myArray = {20,32,76,22,56};

		return myArray;
	}
	
	
	public static int[]getRandomArray(int size){
		Random random = new Random();
		int [] nums = new int [size];	
		for (int i = 0; i < nums.length; i++) {
			nums[i]= random.nextInt(101);
		}
		
		return nums;
	}
	
	
	
}