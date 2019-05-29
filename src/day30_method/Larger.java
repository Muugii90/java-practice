package day30_method;

import java.util.Arrays;

public class Larger {
	public static void main(String[] args) {
		getLarger(23, 24);
		int []arr  = {2,654,8765,876543,543};
		getMax(arr);
		
		getMax(new int[] {12,456,765,34,8765,3567});
		steps(12);
		steps(-3);
		steps(0);
	}
	
	
	public static void getLarger(int num1, int num2) {
		if(num1> num2) {
			System.out.println("Num1 is larger "+num1);
		}else if(num2 > num1) {
			System.out.println("Num2 is larger "+num2);
		}else {
			System.out.println("Nums are same");
		}
	}
	
	public static void getMax(int []nums) {
		if(nums.length == 0) {
			System.out.println("Error : Array is empty");
			return;
		}
		Arrays.sort(nums);
		System.out.println(nums[nums.length -1]);
	}
	
	
	public static void steps(int step) {
		 if(step == 0) {
			System.out.println("Sit");
		}else if(step > 0) {
			for (int i = 1; i <= step; i++) {
			System.out.println("Step "+ i);
			}
		}else if (step <0) {
			for (int i = 1; i <= step *(-1); i++) {
				System.out.println("Jump "+ i);
		}
	  }
	}

}