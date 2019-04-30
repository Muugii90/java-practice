package Review_Murodil;

import java.util.Scanner;

public class PrintMiddle {
	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		String word = "javaclass";
		System.out.println(word.charAt(word.length()/2));
		System.out.println();
		
		
		word = "javadays";
		String middle2 = word.charAt(word.length()/2-1)+""
						+word.charAt(word.length()/2);
		System.out.println(middle2);
		
		String middleTwo = word.substring(3,5);
		String middle = word.substring(word.length()/2-1, word.length()/2+1);
		System.out.println(middleTwo);
		System.out.println(middle);
		
		
		
		System.out.println("Enter word, i will give u middle one(s)");
		String strInput = scan.next();
		String m ="";
		if(strInput.length() % 2 == 0) { //even count of chars
			m = strInput.substring(strInput.length()/2-1, strInput.length()/2+1);
		}else {
			m = strInput.substring(strInput.length()/2, strInput.length()/2+1);
		}
		System.out.println("M:" + m);
		
		
		
		
		
	}
}
