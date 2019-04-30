package day10_logical;
import java.util.*;
public class CreditScoreRating {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entor your credit score: ");
		int creditScore;
		//Excellent => 750 - 850 range
		creditScore = scan.nextInt();
		if (creditScore >= 750 && creditScore <= 850) {
			System.out.println("Excellent");
		}else if (creditScore >= 700 && creditScore <= 749) {
			System.out.println("Good");
		}else if (creditScore >= 650 && creditScore <= 699) {
			System.out.println("Fair");
		}else if (creditScore >= 550 && creditScore <= 645) {
			System.out.println("Poor");
		}else if (creditScore >= 0 && creditScore <= 549) {
			System.out.println("Poor");
			
		}else {
			System.out.println("Invalid score");
			}	
		}

}
