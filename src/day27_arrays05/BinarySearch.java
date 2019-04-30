package day27_arrays05;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {

		//Binary search ==> 
		int [] nums = {4, 6, 7, 19, 189};
		
		
		System.out.println(Arrays.binarySearch(nums, 7));
		System.out.println(Arrays.binarySearch(nums, 189));
		System.out.println(Arrays.binarySearch(nums, 5));// not in list 
		
		int i = Arrays.binarySearch(nums, 19);
		System.out.println(i);
		
		int [] nums2 = {40, 6, 17, 10, 55};
		Arrays.sort(nums2);
		System.out.println(Arrays.binarySearch(nums2, 40));
		//Arrays.binarySearch(a, fromIndex, toIndex, key)
		//Arrays.sort(a, fromIndex, toIndex, c); comparator

	}

}
