package day08_casting_conditionals;

import java.util.Scanner;

public class IfElsewithScanner {
	public static void main (String [] args) {
		
		//passing percentage  = 65;
		//youScorePercentage =take from  scanner
		//check if you passed or failed
		
		Scanner score = new Scanner (System.in);

		int  passingPercentage = 65;
		System.out.println("What is your score: ");
		
		int yourScorePercentage = score.nextInt();
		
		if (yourScorePercentage >= passingPercentage) {
			System.out.println("You passed! Gongrats!");
		}else { 
			System.out.println("You failed! Study more! Don't be sad");
		
		}
			
		}
		
		
		
		
		
	}

