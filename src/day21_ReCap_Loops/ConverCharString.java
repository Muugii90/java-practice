package day21_ReCap_Loops;

public class ConverCharString {

	public static void main(String[] args) {
		
		char ch ='a';
		String str1 = ""+ch;
		System.out.println(str1);
//==============================================
	// this way to convert char to string
		char ch2 = 'v';
		String str2 = new String(""+ch2);
		String str3 = Character.toString(ch2);
		System.out.println(str2);
		System.out.println(str3);
//=============================================
		// Converting char to string char ==> string ch==>str
		
		
	}

}
