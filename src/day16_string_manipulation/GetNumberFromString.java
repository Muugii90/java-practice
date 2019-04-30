package day16_string_manipulation;

public class GetNumberFromString {

	public static void main(String[] args) {
		String sentence = "I wrote [100]lines of code today";
		int start = sentence.indexOf ('[')+1 ;
		int end = sentence.indexOf(']');
		
		String codeCount =sentence.substring(start, end);
		System.out.println("Line of code: "+ codeCount);
		
		System.out.println("Line of code: "+sentence.substring(sentence.indexOf('[')+1, sentence.indexOf(']')));

		
		//check if codeCount more than 20
		int count = Integer.parseInt(codeCount);//=== convert String to int ===
		if (count > 20) {
			System.out.println("Wrote more than 20 lines of code today");
		}else {
			System.out.println("Not enough coding for today");
		}
		
	}

}
