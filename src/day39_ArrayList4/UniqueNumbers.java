package day39_ArrayList4;

import java.util.ArrayList;
import java.util.List;

public class UniqueNumbers {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		
		nums.add(23);
		nums.add(33);
		nums.add(23);
		nums.add(4);
		nums.add(78);
		nums.add(19);
		nums.add(78);
		System.out.println(nums);
		for (int i = 0; i < nums.size(); i++) {
			int count = 0;
			Integer unique = 0; 
				for (int j = 0; j < nums.size(); j++) {
					if(nums.contains(j) ) {
						count++;
					}
				}
				System.out.println(unique);
				//if(!uniqie == )
		}
	}

}
