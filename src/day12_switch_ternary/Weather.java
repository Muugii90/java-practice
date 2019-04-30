package day12_switch_ternary;
import java.util.*;
public class Weather {
	
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	String weather, sunny, hot, windy, rainy, snow;
	System.out.println("What is the weather today? ");
	weather = scan.next().toLowerCase();
	
	switch (weather) {
	case "sunny":
		System.out.println("Go to Park");
		System.out.println("Code Java");
		break;
	case "hot":
		System.out.println("Go Swimming");
		System.out.println("Code Java");
		break;
	case "windy":
		System.out.println("Fly a kite");
		System.out.println("Code Java");
		break;
	case "rainy":
		System.out.println("Thursday");
		System.out.println("Code Java");
		break;
	case "snow":
		System.out.println("Chain your tiers");
		System.out.println("Go skiing");
		System.out.println("Code Java");
		break;
	default:
		System.out.println("Code Java in any other weather.");
	

	}
	System.out.println(" ### End the program ###");

}
	
}