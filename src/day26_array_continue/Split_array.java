package day26_array_continue;
import java.util.*;

public class Split_array {

	public static void main(String[] args) {
		
		String words = "java,kava,html,selenium";
		String[] wordsArray=words.split(",");
		System.out.println("Count: " + wordsArray.length);
		System.out.println(wordsArray[0]);

		System.out.println(Arrays.toString(wordsArray));
		System.out.println("****************");
		for(String word : wordsArray ) {
			System.out.println(word);
		}

		String diceResult = "1 - 20 of 1,461 positions";
		//using split method, print 1,461
		String[] diceArray = diceResult.split(" ");
		System.out.println("****************");
		System.out.println("Search result total: " + diceArray[4]);
		System.out.println("****************");
		String[] diceArray2 = diceResult.split("of");
		System.out.println(diceArray2[0].trim());
		System.out.println(diceArray2[1].trim());

		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
		String[] allWords = sentence.split(" ");
		String[] happySplit = sentence.split("happy");
		String[] ISplit = sentence.split("I");
		System.out.println("*****SPLIT ALL WORDS*****");
		for(String w : allWords) {
			System.out.println(w);
		}
		System.out.println("****************");
		
		
		System.out.println("WITHOUT HAPPY");
		for (String h : happySplit) {
			System.out.println(h);
		}
		System.out.println("WITHOUT I");
		for (String i : ISplit) {
			System.out.println(i);
		}
		System.out.println("PRININNG JAVA SPLITED");
		             //0123  
		String word = "java";
		char[] charsArray = word.toCharArray();

		for(char ch : charsArray) {
			System.out.println(ch);
		}

	}
}
