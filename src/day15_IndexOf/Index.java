package day15_IndexOf;

public class Index {
	public static void main(String[] args) {
		
		String str = "java k";
		System.out.println(str.indexOf("j"));// 'j' printing same result
		System.out.println(str.indexOf("va"));
		System.out.println(str.indexOf(" "));// print space as well as character
	
		System.out.println(" ");
		
		
		String url = "www.okta.com";
		int index = url.indexOf(".");
		System.out.println("Pos of . "+ index);// first one will print 3
		
		System.out.println("After dot s character "+ url.charAt(index-1));// index is printing variable
	
	
	
	String title = "Java - Google Search";
	int dash = title.indexOf('-');
	System.out.println ("Show me something: "+ title.charAt(dash +9 ));
	
	String country = "United State of America";
	int states = country.indexOf("S");
	System.out.println ("Positions of states "+ states);
	
	String word2 = "java, C++, python, tomcat, eclipse ";
	if (word2.contains("C++")) {
		System.out.println("C++ here");
	}else {
		System.out.println("C++ not here");
	}
	if (word2.indexOf("C++") > -1 ){// case sensitive
		System.out.println("C++ here");
	}else {
		System.out.println("C++ not here");
	}
}
	
	
}