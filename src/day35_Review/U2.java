package day35_Review;

import java.util.Arrays;

public class U2 {

	public static void main(String[] args) {
		int[]nums = { 7, 4, 1, 4, 1, 5, 9, 9, 3 };
		System.out.println("Array "+ Arrays.toString(getUniqueArray(nums)));
	}
		public static int [] getUniqueArray(int[]nums){
			int count = 0;
			int uniqueCount = 0;
			
			for (int i = 0; i < nums.length; i++) {
				count = 0;
				for (int j = 0; j < nums.length; j++) {
					if (nums[i] == nums[j] && i!=j) {
						count++;
					}
				}
				if (uniqueCount == 1) {
					uniqueCount++;
			}
			}
			int [] uniqueArray = new int[uniqueCount];
			int idx = 0;
			for (int i = 0; i < nums.length; i++) {
				count = 0;
				for (int j = 0; j < nums.length; j++) {
					if (nums[i] == nums[j] && i!=j) {
						count++;
						break;
					}
				}
				if (count == 0) {
					uniqueArray[idx]=nums[i];
					idx++;

				}
			}
			return uniqueArray;
	
}
}
