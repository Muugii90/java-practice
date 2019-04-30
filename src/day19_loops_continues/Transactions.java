package day19_loops_continues;
import java.util.*;
public class Transactions {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("What is your current amount ");
		
		double balance = scan.nextDouble();
		double transcationAmount;
		int count = 0;
		
		while (balance > 0) {
			count++;//increase transaction by 1
			System.out.println("What is transaction #"+count+" amount?");
			transcationAmount = scan.nextDouble();
			if(transcationAmount > balance) {
				System.out.println("Warning! Your balance is about to be negative ");
				//continue; keeps asking enter another amount
			}
			balance = balance - transcationAmount;
			System.out.println("Current balance $"+ balance);
			}
			System.out.println("Your have insufficient funds, your balance is $"+ balance);
			System.out.println("Transaction total count: "+ count);
			
			//balance++;
			
			
			}
			
		}
	

