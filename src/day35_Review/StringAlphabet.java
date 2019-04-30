package day35_Review;

import java.util.Scanner;

public class StringAlphabet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";

		String word = "munkhnasan";
		char first = word.charAt(0);
		int postion = alphabet.indexOf(first);
		System.out.println("Postion: " + postion);
		
		char enChar = encrypted.charAt(postion);
		System.out.println(first + " --> " + enChar);

		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int index = alphabet.indexOf(ch);
		System.out.println(ch+ " --> "+encrypted.charAt(index));

		}
	}
}
