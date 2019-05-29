package day41_CustomClass;

public class BankAccount {

	double balance;
	String accountHolder;
	int accountNum;

	
	public void diposit(double amount) {
		System.out.println("Depositing $ "+ amount+" to "+ accountHolder);
		balance += amount;
		
	}
	public void withdraw(double amount) {
		System.out.println("withdrawing "+ amount + " from "+ accountHolder);
		balance -=amount;
		if(balance> 0) {
			balance -= 35;
	}	
		}
	  
	public void showBalance( ) {
		System.out.println("====================");
		System.out.println("Account Holder "+ accountHolder);
		System.out.println("Account Number "+ accountNum);
		System.out.println("Balance $ " + balance);
	}
	
	public void charge(double price, String item) {
		
		if(balance >= price) {
			System.out.println("buying "+item +"for $ "+price+" from "+ accountNum);
			balance -= price;
		}else {
			System.out.println("insufficent funds to purchase "+ item + " from "+ accountNum);
		}
		
		
	}
	
	}