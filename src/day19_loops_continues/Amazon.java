package day19_loops_continues;
import java.util.*;
public class Amazon {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		//System.out.println("amaZon");
//		String word = "zmaAon";
//		char a = word.charAt(3);
//		char z = word.charAt(0);
//		String word2 = word.substring(1,3);
//		String word3 = word.substring (4);
//		String word4 = a+word2+z+word3;
//		
//		
//		System.out.println(word4);
//		System.out.println(word4.toUpperCase());
//		
//		System.out.println(word.substring(0));
		
		System.out.println("Enter a word:");
		String word=scan.next();
		
		String lastHalf=word.substring(word.length()/2-1);
		String firstHalf=word.substring(0, word.length()/2);
		System.out.println(lastHalf+firstHalf);
		
	}

}
