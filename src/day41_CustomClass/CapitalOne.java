package day41_CustomClass;

public class CapitalOne {

	public static void main(String[] args) {
		BankAccount capital = new BankAccount();
		capital.accountHolder = "Munkhnasan Enkhabayar";
		capital.accountNum = 123456;
		capital.diposit( 100000);
		capital.withdraw(1000);
		capital.showBalance();
		capital.charge(50, "wooden spoon");
	}

}
