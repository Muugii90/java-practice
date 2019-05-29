package Review_Murodil;

import java.text.DecimalFormat;
import java.util.Arrays;

public class May01_method {

	public static void main(String[] args) {

		System.out.println(milesToKms(10));
		System.out.println(milesToKms(70));
		double km = 45;
		System.out.println(km);
		System.out.println(multiply(10, 10));
		System.out.println(multiply(4, 6));
		System.out.println(milesToKms(20));
		
		
		double liters = GallonToLiters(15);
		DecimalFormat dm = new DecimalFormat("#.##");
		System.out.println(dm.format(liters));
		System.out.println(GallonToLiters(15));
		System.out.println(Math.floor(liters));
	}

	public static double milesToKms(double miles) {

		// double kmValue = miles * 1.609;

		double kmValue = multiply(miles, 1.609);
		return kmValue;
	}

	public static double multiply(double num1, double num2) {
		return num1 * num2;

	}
	
	public static double GallonToLiters(double gallons) {
		double gallon = multiply(gallons, 3.785);
		
		return gallon;
	}
}
