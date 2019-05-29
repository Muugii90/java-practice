package day50_Inheritance03;

public class Constractor extends Employee {
	@Override
	public void calculaterPay(int hours, double rate) {
		double total = (hours *rate) + 200;
		System.out.println("Contractor employee total pay: "+ total);
	
	}
	
}
