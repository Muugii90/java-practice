package day42_CustomClasses_encapsulation;

public class ATM {

	public static void main(String[] args) {
		
		Balance bal=new Balance();
		bal.setAccBalance("$2000");
		
		System.out.println("Name: "+bal.getAccHolderName()+" | Account Number: "+bal.getAccNumber()+" | Account Balance: "+bal.getAccBalance());

		
	}

}
