package day20_forLoops;

public class IndexOf {

	public static void main(String[] args) {
		
		String word = "amazon";
		//char letter ='m';
		int index =0;
		//for loop
		
		
		for(int i = 0; i< word.length(); i++) {
			if(word.charAt(i) =='m') {
				index = i;
				break;
			}
		}
		System.out.println(index);
		

	}

}
