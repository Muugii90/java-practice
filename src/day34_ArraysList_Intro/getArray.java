package day34_ArraysList_Intro;

import java.util.Arrays;

public class getArray {

	public static void main(String[] args) {
		// this one in below code coding
		System.out.println(Arrays.toString(getArray()));
		// Calling it from another class
		System.out.println(Arrays.toString(CountArray.getArray()));

		int[] nums = CountArray.getArray();
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(CountArray.getRandomArray(10)));
	}

	public static int[] getArray() {
		int[] myArray = { 23, 32, 76, 22, 56 };
		return myArray;
	}

}
