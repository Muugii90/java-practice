package day21_ReCap_Loops;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		System.out.println("Enter word");
		Scanner scan = new Scanner (System.in);
		String word = scan.next();
	
		String unique = "";
		
//		for(int i =0; i< word.length(); i++) {
//			System.out.print(i);
//		System.out.println(word.charAt(i));	
//		
//		}
		
		for(int i = 0; i< word.length(); i++) {
			char letter = word.charAt(i);
			//System.out.println(letter);
			if(!unique.contains(""+letter)) {
				unique = unique + letter;// assign back to unique
				
			}
		}
		System.out.println(unique);
		
	}	
	}