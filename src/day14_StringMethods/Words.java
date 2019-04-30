package day14_StringMethods;
import java.util.*;
public class Words {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter two words");
	 String word1 = scan.next();
	 String word2 = scan.next();
	 
	 //word1.charAt(0);
	 
	 if (word1.length() > word2.length()){
		 System.out.println(word1 +" is longor");
	}else if (word2.length() > word1.length()) {
		System.out.println(word2 +" is longor");
	}else {
		System.out.println(word1 + " and "+ word2 + " are same length");
	}
	 
	}

}
