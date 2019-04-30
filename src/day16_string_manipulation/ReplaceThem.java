package day16_string_manipulation;

public class ReplaceThem {

	public static void main(String[] args) {
		String sentence = "Coding is fun, it is my hobby!!";
		
		String withNoSpaces = sentence.replace( " ", "");
		System.out.println(withNoSpaces);
		
		System.out.println(sentence);
		
		sentence = sentence.replace( "," , "!!!");
		System.out.println(sentence );
		
		System.out.println();
		
		String mixed = "&^@#j$a-v|a%^&";
		System.out.println (mixed);
		mixed = mixed.replace("&^@#", "");
		System.out.println(mixed);
		
		mixed = mixed.replace("%^&", "");
		System.out.println(mixed);
		
		mixed = mixed.replace("$", "").replace("|", "").replace("-", "");//chain
		System.out.println(mixed);// cleaning one by one
		
		String result = "About 115,000,000 results (0.59 seconds)";
		//result = result.substring(6, 18);
		//System.out.println(result);
		
		result = result.replace("About ", "");
	//	result = result.replace(" results (0.59 seconds)", "");// it maybe break the code
		//System.out.println(result);
		result = result.substring (0,result.indexOf(" "));// finding first space // 115,000,000
		System.out.println(result);
		
		
		
		result = result.replaceFirst(",", "");// 115000,000 first , is replaced for empty
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
