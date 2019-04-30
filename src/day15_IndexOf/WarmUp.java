package day15_IndexOf;
//import java.util.*;
public class WarmUp {

	public static void main(String[] args) {
	//Scanner scan = new Scanner (System.in);	
		
	String emoji = ";O";
	// check here it 
	if (emoji.length() !=2 ) {
		System.out.println("Invalid emoji");
		return;
	}	
	char first = emoji.charAt(0);
	char second = emoji.charAt(1);
	if (first == ':') {
		if (second == ')') {
			System.out.println("smile");
		}else if (second == '(') {
			System.out.println("sad");
		}else if (second == '/') {
			System.out.println("upset");
		}else if (second == 'p') {
			System.out.println("playful");
		}
		
	 }else if (first == ';') {
	 if(second == ')') {
		 System.out.println("wink");
	 }else if( second == 'O') {
		 System.out.println("surpised");
	 }else {
		 System.out.println("Unknown emoji");
	 }
	
	}else if (first == '('){
		if (second == ':') {
			System.out.println("Smile");
		}else {
			System.out.println("Unknown");
		}
	}else if (first == ')') {
		if (second == ';') {
			System.out.println("Sad");
		}else {
			System.out.println("Unknow one");
		}
		
	}else {
		System.out.println("Invalid Emoji");
	}
	}

}
