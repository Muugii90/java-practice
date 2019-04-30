package day33_method;

import day35_Review.UniqueArray;

public class AgeCalculator {
	
	public static void main(String[] args) {
		
		//int [] nums = {12,44,55,55,66,55};
		//UniqueArray.array(new int[]{22,33,44,22,3,4,3});
		
		//System.out.println(calculateAge(1990));
		//System.out.println(calculateAge(2025));
		//System.out.println(missingChar("kitten", 1));
	}

	public static int calculateAge(int year) {

		int age = 2019 - year;
		if (age < 0) {
			System.out.println("Invalid age");
			return 0;
		} else if (age > 1 && age <= 14) {
			System.out.println("Child");
		} else if (age > 15 && age <= 25) {
			System.out.println("Youngster");
		} else if (age > 26 && age <= 65) {
			System.out.println("Adult");
		} else {
			System.out.println("Senior");
		}
		return age;
	}
	public static String missingChar(String str, int n) {
		  String front = str.substring(0,n);
		  String back = str.substring(n+1,str.length());
		  return front+back;
		}
	
}
