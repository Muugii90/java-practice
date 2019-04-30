package day06_operators2;

import java.util.Scanner;

public class FunnyOne {
	public static void main (String [] args) {
		
	Scanner key = new Scanner (System.in);
	
	System.out.println("Enter a line of text with two words:");
	String s1;
	String s2;
	
	s1 = key.next();
	s2 = key.next();
	
	System.out.println( "You entered: \"" + s1 + "\"" + "\"" + s2 +"\"");
	//System.out.println("\'" + s1 + "\'" + "\'" + s2 + "\'");
	
	}
	
		
		
	
	
	

}
