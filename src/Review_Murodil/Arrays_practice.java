package Review_Murodil;

import java.util.Arrays;

public class Arrays_practice {

	public static void main(String[] args) {
		
		int []nums = {1, 4, 6, 7, 12};
		int []nums2 = {1, 4, 6, 3, 7, 12};
		int []nums3 = {1809, 47, 6, 3333, 7, 12};
		isArraySorted(nums);
		isArraySorted(nums2);
		isArraySorted(nums3);
	}

		public static void isArraySorted(int[] nums) {
		boolean sorted = true;
		for (int i = 0; i < nums.length-1; i++) {
			System.out.println(nums[i]+ " "+ nums[i+1]);
			if(nums[i] > nums[i+1]) {
				sorted = false;
			break;
			
			}
		}
		System.out.println("Is arrays sorted? "+ sorted);
		}
		
}


