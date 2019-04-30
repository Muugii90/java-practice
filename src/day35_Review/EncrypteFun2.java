package day35_Review;

public class EncrypteFun2 {

	public static void main(String[] args) {
		System.out.println(encryptChar('z'));
		System.out.println(encryptWord("sunday"));
		String normal = "html";
		String encrypted = encryptWord(normal);
		System.out.println("normal: " + normal +"\n"+
							"encrypted: "+encrypted);
		System.out.println(encryptSentence(""));
		System.out.println(encryptSentence("szev z tllw wzb"));
	}

	public static char encryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		//return encrypted.charAt(alphabet.indexOf(ch));
		int i = alphabet.indexOf(ch);
		char ret = encrypted.charAt(i);
		return ret;
	}

	public static String encryptWord(String word) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		String cyphered = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			int postion = alphabet.indexOf(ch);
			
			cyphered = cyphered+ encrypted.charAt(postion);
		}
		return cyphered;
	}
	
	public static String encryptSentence(String sentence) {
		String[] wordArr= sentence.toLowerCase().split(" ");
		String reValue = ""; 
		for (String word: wordArr) {
			reValue = reValue+encryptWord(word)+" ";
		}
		return reValue.trim();
	}
	
}
