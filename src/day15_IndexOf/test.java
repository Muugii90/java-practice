package day15_IndexOf;

public class test {

	public static void main(String[] args) {
		String word = "eclipse";
		//startsWith ==> test if string starts with another string
		System.out.println(word.startsWith("e"));
		System.out.println(word.startsWith("ec"));
		System.out.println(word.startsWith("ecip"));
		
		System.out.println(word.startsWith("Ec"));
		// endsWith
		
		System.out.println(word.endsWith ("e"));
		System.out.println(word.endsWith ("ipse"));
		System.out.println(word.toUpperCase().endsWith("PSE"));// toUpperCase and make is equal// true
		
		System.out.println(word.endsWith ("e"));
		System.out.println(word.startsWith("eclipse"));
		System.out.println(word.endsWith("eclipse"));
		
		// Mr. Mrs. Ms. Dr.
		String name = "Dr.";
		if (name.startsWith("Mr.")) {
			System.out.println("Man");
		}else if (name.startsWith("Ms.")) {
			System.out.println("woman");
		}else if (name.startsWith("Mrs.")) {
			System.out.println("Married woman");
		}else if (name.startsWith ("Dr.")) {
			System.out.println("Doctor");
		}else {
			System.out.println("Unlhown man oe woman");
		}
	}

}
