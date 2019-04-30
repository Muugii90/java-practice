package day19_loops_continues;

public class PrintLetters {

	public static void main(String[] args) {
		String word = "Amazon";
			//index    012345
			//length   123456
		//System.out.println (word.length ()-1);
		//System.out.println(word.charAt(0));

		//System.out.println(word.charAt(idx));
		//idx++;
		//System.out.println(word.charAt(idx));
		  int idx = 0;
		  while(idx < word.length()) {
			  System.out.println(word.charAt(idx));
			  idx++;
		  }
		  System.out.println();
		 
		  int reverse = word.length()-1;//5
		  while(reverse >= 0) {
			 System.out.println(word.charAt(reverse));
			 reverse--;
		 }
		
		
			
		
}
}