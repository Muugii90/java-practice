package day19_loops_continues;

import java.util.*;

public class GuessANumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Random random  = new Random();// is used to random numbers 
		
		System.out.println("###Welcom to Number Game###");
		int secretNumber = random.nextInt(101);
		int guessNumber;
		
			
		do {	
			System.out.println("Guess you number: ");
			guessNumber = scan.nextInt();
			if (secretNumber < guessNumber) {
				System.out.println("You number too large");
			}else if (secretNumber > guessNumber) {
				System.out.println("Your number is too small");
			}
		}while (guessNumber !=secretNumber);
	
	
		System.out.println("Bingo Congrats! You won");
	}

}
