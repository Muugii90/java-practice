package day32_CustomMethods;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysParameters {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//
//		int[] myArray = new int[5];
//		for (int i = 0; i < myArray.length; i++) {
//			myArray[i] = scan.nextInt();
//
//		}
		int[] one = { 12, 11, 10 };
		int[] two = { 30, 10, 70, 90 };
		print2Arrays(one, two);

		//printArray(myArray);
		//printArray(new int[] { 12, 32, 32 });
		//printArray(new int[] { 123, 43, 43, 432, 32, 132, 154, 365, 43 });
		//int[] myNums = new int[] { 2, 8, 987, 76, 54, };
		//printArray(myNums);
		print2ArraysV2(one, two);
		System.out.println();
		
	}

	public static void printArray(int[] nums) {
		for (int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();

	}

	public static void print2Arrays(int[] num1, int[] num2) {
		if (num1.length > num2.length) {
			System.out.println(Arrays.toString(num1));
			System.out.println(Arrays.toString(num2));
		} else {
			System.out.println(Arrays.toString(num2));
			System.out.println(Arrays.toString(num1));
		}

	}
	//version 2 
	public static void print2ArraysV2(int[] num1, int[] num2) {
		if (num1.length > num2.length) {
			printArray(num1);
			printArray(num2);
		}else {
			printArray(num2);
			printArray(num1);
		}
}
}
