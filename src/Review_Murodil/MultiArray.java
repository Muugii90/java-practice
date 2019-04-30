package Review_Murodil;

import java.util.Arrays;

public class MultiArray {

	public static void main(String[] args) {
		
		int []nums = {123, 456, 789, 56};
		
		System.out.println(nums[1]);
		nums[1] = 5;
		System.out.println(Arrays.toString(nums));
		
		
		int max = nums[0];
		for (int num: nums) {
			if(num > max) {
				max =num;
			}
		}
		System.out.println("Max num "+ max);
	}

}
