package day24_Array;

public class ArrayOfChars {

	public static void main(String[] args) {
		char [] values = {'a','b','c'}; 
		for(char value : values) {
			System.out.println(value);
		}
	
		System.out.println();
	String str ="Wooden spoon";
	char [] chars = str.toCharArray();
	for(char c : chars) {
		System.out.print(c+"_");
	}
	System.out.println();
	str = "";
	for(int i = chars.length-1; i>=0; i--) {
		str +=chars[i];
		
	}
	//Task replace 'o' for * s
	System.out.println( str);
	
	for (char c : chars) {
		if (c == 'o') {
		System.out.print("*");
	}else {
		System.out.print(c);
	}
	}
}
}