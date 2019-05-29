package Review_Murodil;

import java.util.Arrays;

public class Array_practice {

	public static void main(String[] args) {
		int[] nums1 = { 10, 20, 5, 3, 6 };
		int[] nums2 = { 5, 1, 1, 4, 4 };
		int[] nums3 = new int[nums1.length];

		for (int i = 0; i < nums2.length; i++) {
			nums3[i] = nums1[i] + nums2[i];
		}
		int[] newArray = add2Arrays(nums1, nums2);
		System.out.println("Method calling " + Arrays.toString(newArray));

		System.out.println("Num 1: " + Arrays.toString(nums1));
		System.out.println("Num 2: " + Arrays.toString(nums2));
		System.out.println("Num 3: " + Arrays.toString(nums3));
	}

	public static int[] add2Arrays(int[] nums1, int[] nums2) {

		int[] nums3 = new int[nums1.length];

		for (int i = 0; i < nums2.length; i++) {
			nums3[i] = nums1[i] + nums2[i];

		}
		return nums3;
		
		
	}
}
