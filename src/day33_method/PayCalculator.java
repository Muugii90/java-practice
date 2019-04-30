package day33_method;

public class PayCalculator {

	public static void main(String[] args) {
		
		System.out.println("Total paid: $"+getHourlyPay(3, 70));
		//int nopay = getHourlyPay(10, 0);
		//System.out.println("No pay: "+nopay);
	}
	public static  int getHourlyPay(int hours, int rate ) {
		int total = hours * rate;
		if(hours <= 0) {
			System.out.println("Invalid hours");
			return 0;
		}else if(rate <= 0 ) {
			System.out.println("Invalid rate");
			return 0;
	}
	
		return total;
	}
}
