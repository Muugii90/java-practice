package day27_arrays05;

import java.util.Scanner;

public class CourseNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String url  = scan.nextLine();
		//String url = " https://learn.cybertekschool.com/courses/147";
		// WHITOUT SCANNER 
		String [] urlArr = url.split("/");
		System.out.println("Length: "+ urlArr.length);
		System.out.println(urlArr [urlArr.length-1]);
		
		int courseID = Integer.parseInt(urlArr[4]);// converting String to Integers

		switch (courseID) {
		case 147: 
			System.out.println("Java programming");
			break;
		case 204:
			System.out.println("Mentoring sessions");
			break;
		case 149:
			System.out.println("Software Develpment Life Cycle");
			break;
		case 152:
			System.out.println("QA Testing ");
			break;
		case 144:
			System.out.println("Team activity");
			break;
		case 143:
			System.out.println("Welcome Kit");
			break;
		default:
			System.out.println("No course available");
			
	}

}
}
