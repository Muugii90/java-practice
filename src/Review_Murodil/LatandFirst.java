package Review_Murodil;

import java.util.Arrays;
import java.util.Scanner;

public class LatandFirst {

	public static void main(String[] args) {
	String []words = {"hello", "why", "by", "note", "water"};

	for(String word: words) {
		System.out.println(word.charAt(0)+""+word.charAt(word.length()-1));
		System.out.println(word.substring(0,1)+""+word.substring(word.length()-1));
		//System.out.println(word.substring(word.length()-1));
		
		
		//String  = word.substring(0,1)+""+word.substring(word.length()-1);
		//System.out.println(Arrays.toString(j));
	}
	   Scanner input = new Scanner(System.in);
	    String email = input.nextLine();
	    String []spilted = email.split("@");
	    if(spilted.length == 2) {
	    System.out.println("Email id: "+ spilted[0]);
	    System.out.println("Email domain: "+ spilted[1]);
	}else {
		System.out.println("invalid email");
		}
	    
	
	}

}
