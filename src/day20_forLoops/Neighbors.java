package day20_forLoops;

import java.util.Scanner;

public class Neighbors {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter word");
		String word = scan.next();
		
		for(int i = 0; i< word.length()-1; i++) {
			if(word.charAt(i)== word.charAt(i+1)) {// omho useg deer ni +1 in daraagin usegee garaj bna
				System.out.println("Beeep "+ word.charAt(i));
				
			}
		}

	}

}
