package day24_Array;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {

		// String cars = "BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce,
		// Tesla";
		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla" };
		// int i =0;
		// while(i++<cars.length-1) {
		// System.out.println(cars[i]);
		System.out.println("***** any car names start 'M' letter*******");
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].startsWith("M")) {
				System.out.println(cars[i]);

			}
		}
		System.out.println("***** make sure IgnoreCase and includes 'r *******");
		for (String car : cars) {
			if (car.toLowerCase().contains("r")) {
				System.out.println(car);

			}

		}
		System.out.println("******* Cars name includes 'a' letter ********");
		for (String car1 : cars) {
			if (car1.endsWith("a")) {
				System.out.println(car1);
			}
		}
		System.out.println("********Checking the length more than 6 *******");
		for(String car2 : cars) {
			if(car2.length()>6) {
				System.out.println(car2);
			}
		}
		System.out.println("********Checking the length more than 6 *******");
		for(int i = 0; i< cars.length; i++) {
			if (cars[i].length() >=6){
				System.out.println(cars[i]);
			}
		}
		System.out.println("***** Swap the cars name ***first and last *******");
		String temp = cars[0];
		cars [0] = cars[cars.length-1];
		cars[cars.length -1] = temp;
		
		System.out.println(Arrays.toString(cars));
		Arrays.sort(cars);
		System.out.println(" After sort the cars names");
		
		System.out.println(Arrays.toString(cars));
		System.out.println("Position: "+ Arrays.binarySearch(cars, "Ford"));
	}
	}

