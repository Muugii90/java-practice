package day27_arrays05;

import java.util.Scanner;

public class Times_WarmUp {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		//System.out.println("Enter the time: ");
	
		int []time1 =  new int [2] ;
		int [] time2 = new int [2];
		System.out.println("Enter time1: hour");
		time1 [0] =scan.nextInt();
		System.out.println("Enter time1 minutes: ");
		time1 [1] =scan.nextInt();
		System.out.println("Enter time2: hour");
		time2 [0] = scan.nextInt();
		System.out.println("Enter time2 minutes: ");
		time2 [1] = scan.nextInt();
		
		if (time1[0] <= 0 || time1[0]>23 ){
			System.out.println ("Time1 has invalid hour");
			return;
		}
		if (time1[1]<= 0 || time1[1] >59 ) {
			System.out.println("Time1 has invalid minutes");
			return;
	
		}
		
		if (time2[0] <= 0 || time2[0]>23 ){
			System.out.println ("Time2 has invalid hour");
			return;
		}
		if (time2[1]<= 0 || time2[1] >59 ) {
			System.out.println("Time2 has invalid minutes");
			return;
	
		}
		
		if (time1[0] < time2[0]) {
			System.out.println("Time1 is earlier");
		}else if (time2[0]< time1[0]) {
			System.out.println("Time2 is earlier");
		}else { 
			if(time1[1] < time2[1]) {
				System.out.println("Time1 is earlier");
			}else if (time2[1] < time1[1]) {
				System.out.println("Time2 is earlier");
			}else {
				System.out.println("Same time");
			}
			
		}
		
		
		
	}
	
	
	
	
	

}
