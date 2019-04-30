package Review_Murodil;

import java.util.Arrays;

public class largerNumber {

	public static void main(String[] args) {
		getLarge(100, 20);
		int []arr = {12321,45,65,100};
		getMax(arr);
		steps(0);
		steps(10);
		steps(-5);
	}
		public static void getLarge (int num1, int num2) {
			if(num1 > num2) {
				System.out.println("Num 1: "+num1);
			}else if(num2> num1) {
				System.out.println("Num2: "+num2);
			}else {
				System.out.println("Number are equals: "+ num1);
			}
		}
		public static void getMax (int []nums) {
			if(nums.length == 0) {
				System.out.println("Error Array is empty");
				return;
			
			}
			Arrays.sort(nums);
			System.out.println(nums[nums.length-1]);
		}
		public static void steps (int times) {
			if(times == 0) {
				System.out.println("Sit");
			}else if(times>0) {
				for (int i = 0; i <= times; i++) {
					System.out.println("Step "+ i);
				}
			}else if(times< 0) {
				for (int n=1; n<= times*(-1); n++) {
					System.out.println("Jimp "+n);
				}
			}
			}
		}
		


