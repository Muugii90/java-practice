package day19_loops_continues;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter word to test");
		
		String word = scan.next();
		String reversed = "";
		
		
		int idx = word.length()-1;
		while (idx>=0) {
			reversed = reversed + word.charAt(idx);
			idx--;
			
		}
			System.out.println(reversed);
			if (reversed.equalsIgnoreCase(word)) {
			System.out.println("It is polindrom");
		}else {
			System.out.println("it is not polindrom");
		}

	}
}
