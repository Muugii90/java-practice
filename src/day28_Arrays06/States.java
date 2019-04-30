package day28_Arrays06;

import java.util.Arrays;

public class States {

	public static void main(String[] args) {
	
		int [][]nums = new int [3][4];
		nums [0][0] =100;
		nums [0][1] =234;
		nums [0][2] =189;
		nums [0][3] =999;
		
		nums [1][0] =1678;
		nums [1][1] =2343;
		nums [1][2] =1894;
		nums [1][3] =9996;
		
		nums [2][0] =11100;
		nums [2][1] =11234;
		nums [2][2] =11189;
		nums [2][3] =91199;
		System.out.println(Arrays.deepToString(nums));
		System.out.println(Arrays.toString(nums[0]));
		
		
		int [][] scores = {{3,5,10},{4,6,9,38}};
		System.out.println("Days play/  Number of array" + scores.length);
		System.out.println("Number of valie in 1: "+scores[0].length);
		System.out.println("Number of valie in 1: "+scores[1].length);
		int [][] values = new int [4] [];
		values [0] = new int [] {33,23,5};
		
		values [1] = new int [] {12,44,65,765,8765,87654};
		values [2] = new int [2];// first row 55 add on it, 88 on second one
		values [2][0] = 55;
		values [2][1] = 88;
		values [3] = new int [] {5, 12, 23, 43,321};
		System.out.println(Arrays.deepToString(values));
	}

}
