package day31_methods;

import java.util.Arrays;
import java.util.Scanner;

public class MethodwithString {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String word = scan.nextLine();
		countWords(word);
		googleSearchResults("About 121,000,000 results (0.75 seconds)");
		
	}
	public static void countWords (String sentence) {
		
		String []word = sentence.split(" ");
		System.out.println("Words in this sentence: "+Arrays.toString(word));
		System.out.println("Number of word: "+word.length);
	}
	
	public static void googleSearchResults(String result) {
		
		String []words = result.split(" ");
		String count = words[1].replace(",","");	
		String second = words[3].replace ("(", "");
		
		
		System.out.println(count);
		System.out.println(second);
		
	}

}
