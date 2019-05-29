package day29_GoOver;

public class ReverseString {

	public static void main(String[] args) {
		String today = "tuesday";
		String t = today.substring(0,4);
		String d = today.substring(4);
		System.out.println(t+ '\n'+ d);
		int _42 = 10;
		
		
		for (int i = 0; i < today.length(); i++) {
		//	System.out.println(today.charAt(i));
			
			System.out.println(today.substring(i,i+1));
		}
		for (int j = today.length()-1; j>=0; j--) {
			System.out.print(today.charAt(j)+" ");
			System.out.println();
		}
		
		for(int m = today.length()-1; m >=0; m--){
		System.out.println(today.substring(m,m+1));
		}
		String word = "civic";
		String reversed ="";
		for (int r = word.length()-1; r >=0; r--) {
			System.out.print(word.charAt(r));
			reversed = reversed+ word.charAt(r);
		}
			//System.out.println(reversed);
		if (reversed.equalsIgnoreCase(word)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}

}
