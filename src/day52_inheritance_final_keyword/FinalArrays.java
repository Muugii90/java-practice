package day52_inheritance_final_keyword;

import java.util.Arrays;

public class FinalArrays {

	public static void main(String[] args) {
		
		final int []TEAMS = new int []{11,11};
		System.out.println("Team1: "+TEAMS[0]);
		System.out.println("Team2: "+TEAMS[1]);
		
		TEAMS[0]= 10;
		TEAMS[1]= 9 ;
		
		System.out.println("Team1: "+TEAMS[0]);
		System.out.println("Team2: "+TEAMS[1]);
		
		
		int []nums = new int [] {12,4543,543};
		System.out.println(Arrays.toString(nums));
		nums = new int [] {23,543,234,5,5,6};
		System.out.println(Arrays.toString(nums));// changing the value changed new array
		
		final int []finalNums = {23,54,87,6654};
		System.out.println(Arrays.toString(finalNums));
		finalNums[0]= 99;
		System.out.println(Arrays.toString(finalNums));
		
		final double []PRICES  = new double [3];
		PRICES[0]= 85.5;
		PRICES[1]= 99.99;
		PRICES[2]= 100;
		System.out.println(Arrays.toString(PRICES));
		PRICES[0] = 200.90;
		System.out.println(Arrays.toString(PRICES));
	
		
	}

}
