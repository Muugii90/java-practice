package day16_string_manipulation;

public class BuildWord {

	public static void main(String[] args) {
		String chars = "{{}}";
		String word = "java is fun";
		
		String result = chars.substring(0,2)+ word+ chars.substring(chars.length()- 2);
		//chars.substring(2))
		System.out.println(result);
		
		String words = "Zonama";
		String result1 = words.substring(0,3);
		String result2 = words.substring(3,6);
		System.out.println(result2 + result1);
		String sum = result2+ result1;
		sum = sum.toLowerCase();
		System.out.println(sum.substring(1));
		char a = sum.charAt(0);
		System.out.println(a);
		
		//String b = a.toUppercase();
		
		
		
	}

}
