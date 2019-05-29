package day37_ArrayList;

import java.util.ArrayList;

public class RemoveInteger {

	public static void main(String[] args) {
		ArrayList <Integer> nums = new ArrayList<>();
		
		System.out.println(nums.size());
		
		System.out.println(nums.isEmpty());
		System.out.println(nums.size()==0);
		
		nums.add(4);
		nums.add(2);
		nums.add(443);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		System.out.println(nums);
		nums.remove(5);
		System.out.println(nums);
		
		Integer n1 = new Integer(5);
		Integer n2 = Integer.valueOf(5);
		nums.remove(n1);
		System.out.println(nums);
		
		nums.remove(new Integer (4));
		System.out.println(nums);
	}

}
