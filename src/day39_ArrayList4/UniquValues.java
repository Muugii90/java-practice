package day39_ArrayList4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniquValues {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();

		nums.add(23);
		nums.add(3);
		nums.add(23);
		nums.add(43);
		nums.add(6);
		nums.add(3);
		nums.add(43);
		nums.add(1);
		nums.add(99);

		// 1. find Non Duplicated - Distinct unique values.
		List<Integer> unique1 = new ArrayList<>();

		for (Integer num : nums) {
			if (!unique1.contains(num)) {
				unique1.add(num);
			}
		}
		System.out.println(unique1);

		List<Integer> unique2 = new ArrayList<>();
		
		for (int i = 0; i < nums.size(); i++) {
			int count = 0;
			Integer value = nums.get(i);
			for (int j = 0; j < nums.size(); j++) {
				if(nums.get(j) == value && 	i!=j) {
					count++;
					break;
				}
			}
			if(count == 0) {
				unique2.add(value);
			}
		}
		System.out.println(unique2);

	}

}
