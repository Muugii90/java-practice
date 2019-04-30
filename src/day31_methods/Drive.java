package day31_methods;

import java.util.Scanner;

public class Drive {

	public static void main(String[] args) {
		System.out.println("Enter a car name and speed");
		Scanner scan = new Scanner (System.in);
		String cars = scan.next();
		int speed = scan.nextInt();
		drive(cars, speed);
	}
	public static void drive (String car, int speeds) {
		System.out.println(car+ " is driving "+ speeds + " mph");
	}
}
