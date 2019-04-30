package day28_Arrays06;

import java.util.Scanner;

public class WarmUp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//String sentence = scan.nextLine();
		String sentence = "   You are very interesting person";
		String []strArr = sentence.split(" ");
		String reverse = "";
		for (int i = strArr.length-1; i>=0; i--) {
			reverse = reverse+ strArr[i]+ " ";
		}
		reverse = reverse.trim();
		System.out.println(reverse);
	}

}
