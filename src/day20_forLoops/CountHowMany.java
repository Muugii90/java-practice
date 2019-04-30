package day20_forLoops;

public class CountHowMany {

	public static void main(String[] args) {
		
		String word = "[computer] programming";
		
		//char myChar = 'm';
		
		int count = 0;
		
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i)=='m') {
				count++;
			}
			}
			System.out.println(count);
		
		
		
			//int word2 = word.indexOf("[");
			//int word3 = word.indexOf("]");
			//System.out.println(word.substring(word2+1, word3));
			
		
	}

}
