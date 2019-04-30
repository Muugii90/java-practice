package Review_Murodil;

import java.util.Arrays;

public class RemoveOneElement {

	public static void main(String[] args) {
		
		int[] nums = { 1, 3, 1, 4, 1, 6 };
		int target = 1;
		System.out.println(Arrays.toString(removeFromArray(nums, target)));
		//======Reusing the method========
		int[] nums2 = removeFromArray(new int[] { 3, 3, 5, 5, 6, 1, 3 }, 3);
		System.out.println(Arrays.toString(nums2));

		//======================Arrays ===============================
		int counter = 0;

		for (int n : nums) {
			if (n == target) {
				counter++;
			}
		}
		int[] newArr = new int[nums.length - counter];
		int idx = 0;
		for (int n : nums) {
			if (n != target) { // (!(n==target))
				newArr[idx] = n;
				idx++;
			}
		}

		System.out.println(counter);

		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(newArr));

	}
//====================Method======================================
	public static int[] removeFromArray(int[] nums, int target) {
		int counter = 0;

		for (int n : nums) {
			if (n == target) {
				counter++;
			}
		}
		int[] newArr = new int[nums.length - counter];
		int idx = 0;
		for (int n : nums) {
			if (n != target) { // (!(n==target))
				newArr[idx] = n;
				idx++;
			}
		}
		return newArr;
	}

}
