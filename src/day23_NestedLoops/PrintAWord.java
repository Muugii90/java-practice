package day23_NestedLoops;

import java.util.Scanner;

public class PrintAWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		
		String word1 =" ";
		
		for (int i = 0; i<6; i++) {
			System.out.println("Enter a word");
			String word = scan.next();
			if(word.equals("java")) {
				continue;
			}
		word1= word1+word+",";
		 
		}
		word1=word1.substring(0, word1.length()-2);
		System.out.println("Summary"+ word1);
		
		//System.out.println("All words: "+ );
	}

}
