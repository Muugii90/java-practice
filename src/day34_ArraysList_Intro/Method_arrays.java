package day34_ArraysList_Intro;

import java.util.Scanner;

public class Method_arrays {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter a size");
		int size = scan.nextInt();
		int[]myArray = new int [size];
		
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("enter array num : "+(i+1));
			myArray[i]=scan.nextInt();
		}
		
		System.out.println("Enter value: ");
		int value = scan.nextInt();
		
		System.out.println("Count: "+ findOccurences(myArray, value));
	}
	public static int findOccurences(int[]array, int value) {
		int counter = 0;
		for (int num: array) {
			if(num == value) {
				counter++;
			}
			
		}
		return counter ;
	}
}
