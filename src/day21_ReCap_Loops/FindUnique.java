package day21_ReCap_Loops;

import java.util.Scanner;

public class FindUnique {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		String word = "javva";
		String unique = "";
		
		char ch = word.charAt(0);
		System.out.println(unique.contains(""+ch));
		
		if(!unique.contains(" "+ch)) {
			unique = unique + ch;
		}
		System.out.println("Unique "+unique);
		
		
		
		String word2 = "bananas";
		String unique2 = "";
		int i = 0;
		char ch2 = word2.charAt(i);
		System.out.println("Ch2 "+ ch2);
		
		
		i =1;
		ch2 = word2.charAt(i);
		System.out.println(ch2);
		
		i ++;
		ch2 = word2.charAt(i);
		System.out.println(ch2);
		//if(unique2.contains(ch))
		}
	
		
}
