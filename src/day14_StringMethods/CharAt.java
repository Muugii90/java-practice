package day14_StringMethods;

public class CharAt {

	public static void main(String[] args) {
	
		String word ="Munkhnasan";
		System.out.println (word.charAt(0));
		System.out.println (word.charAt(1));
		System.out.println (word.charAt(2));
		System.out.println (word.charAt(3));
		System.out.println (word.charAt(4));
		System.out.println (word.charAt(5));
		System.out.println (word.charAt(6));
		System.out.println (word.charAt(7));
		System.out.println (word.charAt(8));
		System.out.println (word.charAt(9));
		
		String word2 = "java";
		if(word2.charAt(0)== 'J') {
			System.out.println("J is first char");
		}else {
			System.out.println("J is not first char");
		}
		
		String word3 = "madam";
		if (word3.charAt(0) == word3.charAt(4)) {
			System.out.println("First and last match");
		}else {
			System.out.println("First and last are different");
		}
		
		String word4 = "civil";
		char first = word4.charAt(0);
		char last = word4.charAt(4);
		if (first == last) {
			System.out.println("First and last match");
		}else {
			System.out.println("First and last are different");
		}
		
		String word5 = "Mongolia";
		char lastChar = word5.charAt(word5.length()-1);
		char lastCharl = word5.charAt(word5.length()-5);
		System.out.println("Last char of "+ word5 + " is " + lastChar);
		System.out.println("Last char of "+ word5 + " is " + lastCharl);
		
		//zonAma
		String words = "zonAma";
		word2=words.substring(3,words.length());
		System.out.println(word2);
		
		
	}

}
