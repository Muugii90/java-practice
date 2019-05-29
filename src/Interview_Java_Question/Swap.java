package Interview_Java_Question;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {
		int []nums = {1,2,8,3,4};
		
		    if (nums.length > 0) {
		        int temp = nums[0];
		        nums[0] = nums[nums.length-1];
		        nums[nums.length-1] = temp;
		    }
		    System.out.println(Arrays.toString(nums));
		

	int []num = {10,20,30,40,50};
		
	    if (num.length > 0) {
	        int temp = num[0];
	        num[0] = num[num.length-1];
	        num[num.length-1] = temp;
	    }
	    System.out.println(Arrays.toString(num));
	}

}
