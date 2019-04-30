package day18_while_dowhile_loop;

public class ABCTrangle {

	public static void main(String[] args) {
		
		String letter = " ";
		char myLetter = 'A';
		while (myLetter <= 'Z') {
			letter = letter + myLetter;
			System.out.println(letter);
			myLetter++;
			}
		String letter1 = " ";
		char myLetter1 = 'Z';
		while (myLetter1 >= 'A') {
			letter1 = letter1 + myLetter1;
			System.out.println(letter1);
			myLetter1--;
		
		}
	}	

}
