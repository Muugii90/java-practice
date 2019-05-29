package day42_CustomClasses_encapsulation;

public class Calculate {

	public static void main(String[] args) {
		
		CalculationUtils cal = new CalculationUtils();
		System.out.println(cal.plus(20,10)+ cal.plus(30, 40));
		
		//cal.subtraction(20, 10);
		//cal.divide(20, 10);
		cal.multiply(20, 10);
	}
}
