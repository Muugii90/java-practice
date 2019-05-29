package day36_WrapperClasses_ArraysListIntro;

public class WrapperClassMethod {

	public static void main(String[] args) {
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		int count = Integer.parseInt("234432");
		System.out.println("Count: "+count);
		
		int count2 = Integer.valueOf("2345");
		System.out.println(count2);
		
		
		System.out.println(Character.isAlphabetic('.'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isDigit('1'));
		
		
		String str = "java101";
		System.out.println(Character.isAlphabetic(str.charAt(0)));
		System.out.println(Character.isDigit(str.charAt(6)));
		System.out.println();
		String word = "ab123c5dfr1";
		for (int i = 0; i < word.length(); i++) {
			if(Character.isDigit(word.charAt(i))) {
				System.out.println(word.charAt(i));
			}
		}
		
		
	}

}
