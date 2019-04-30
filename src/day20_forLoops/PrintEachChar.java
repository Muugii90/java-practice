package day20_forLoops;

public class PrintEachChar {

	public static void main(String[] args) {
		String word = "Wooden Spoon";
		for ( int i = 0; i< word.length(); i++) {
			System.out.print(word.charAt(i)+ " ");
		}
		System.out.println();
		
		
		for ( int i = 0; i< word.length();i++) {
			
		if(word.charAt(i)=='o' || word.charAt(i)=='e') {
			System.out.print(word.charAt(i)+" ");
		}
	
		//if (!(word.charAt(i)=='o' || word.charAt(i)=='e')) {
			//System.out.print(word.charAt(i)+ ",");
		//}
		
	}
	}

}

