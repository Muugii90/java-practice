package day34_ArraysList_Intro;

import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {

	public static void main(String[] args) {
		
		printWords("Today", "is", "Saturday");
		printWords("red", "blue");
		printWords("Michael John Rem".toUpperCase());
		cook("Buuz", "beef","rice","sour cream");
		System.out.println(sum(1,2,3,4,5));
		String []myPets = {"cat", "horse", "dog", "goat"};
		printWords(myPets);
		shoppingList(1000, "Watch","Bag", "Jacket");
		int budget =200;
		if(sum(10,45,110,30,5)<= budget) {
			System.out.println("Within budget");
		}else {
			System.out.println("Broke");
		}
		int total = sum(23,432,432,21);
		System.out.println("Total: "+ total);	
		
	}
	
	public static void printWords(String... words) {
		// handle it like an ARRAY
		for (String w : words) {
			System.out.print(w+" ");
		}
	}

	public static int sum(int... nums) {
		int sum = 0;
		for (int result : nums) {
			sum = sum+ result;	
		}
		return sum;
	}
	public static void cook(String name, String... ingredients) {
		System.out.print("Food: "+ name);
		System.out.println(Arrays.toString(ingredients));
	}
	
	public static void shoppingList(int price, String... items) {
		System.out.print("Total price: "+ price);
		System.out.println(Arrays.toString(items));
	}
	
	
}
