package day37_ArrayList;
import java.util.*;
public class ArraysAsList {

	public static void main(String[] args) {
		
		List<String> cars = Arrays.asList("Tesla", "Porsche", "Lexus", "Honda");
		List<Integer> nums = Arrays.asList(1, 3, 4, 6, 9);
		
		System.out.println(nums.size());
		System.out.println(nums);
		
		nums.set(1, 100);
		System.out.println(nums);
		
		
		List<Double>price = Arrays.asList(1.0, 13.0, 5.9, 40.0, 6.8, 10.0, 509.90, 800.0, 99.0, 78.0);
		System.out.println(price);
		double sum =0;
		for(double prices :price) {
			sum +=prices;	
		}
		System.out.println("Sum of price: "+sum);
		double sum2 = 0;
		for (int i = 0; i < price.size(); i++) {
			sum2+=price.get(i);
		}
		System.out.println("Sum2 of price:  "+sum2);
		
		
		List<Double> expensive = new ArrayList<>();
		for(double prices : price) {
			if(prices>100.0) {
				expensive.add(prices);
			}
		}
		System.out.println("Expensive: "+expensive);
		
		
	}
}
