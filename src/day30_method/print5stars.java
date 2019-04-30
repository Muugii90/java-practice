package day30_method;

import java.util.Scanner;

public class print5stars {

	public static void main(String[] args) {
			stars(); 
	for(int i = 0; i <100; i++) {
			stars();
		}
		introduce();
	}

	public static void stars(){
		System.out.println("* * * * *");
	}

	public static void introduce() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println("Nice to meet you, "+name);
	}
	
	
}




