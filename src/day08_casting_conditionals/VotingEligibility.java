package day08_casting_conditionals;

import java.util.Scanner;

public class VotingEligibility {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int votingAge = 18;
		
		System.out.println("How old are you?" );
		int yourAge = scan.nextInt();
		int years =  votingAge - yourAge;
		int years2 =yourAge - votingAge;
		
		if (yourAge >= votingAge) {
			System.out.println("You are eligible to voit");
			System.out.println("You have been eligile for " + years2+ " years");
		}else {
			System.out.println("you are not eligible to voit");
			System.out.println("you still have " +years+ " more years to go" );
		}
		
		
		
	}

}
