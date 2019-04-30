package Review_Murodil;
import java.util.*;
public class Arrays_day {

	public static void main(String[] args) {
			int[] nums = {30,20,10,25,15};
		
		System.out.println(Arrays.toString(nums));
		
		for(int n: nums) {
			if(n > 17) {
				System.out.println(n);
			}
		}
		
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum+= nums[i];
		}
		System.out.println("Sum: "+ sum);
		int m = nums[nums.length/2]; //int m = nums[2];
		int l = nums [4];
		System.out.println("m: "+ m + " | l: "+ l);
		System.out.println("========================");
		// Find the lowest number
		int lowest = nums[0];// 30 assign first number then compare
		for (int i = 0; i< nums.length; i++) {
			if (nums[i] < lowest) {
				lowest = nums[i];
				
			}
		}
		System.out.println("Find a lowest number:"+lowest);
		System.out.println("========================");
		//Find highist number
		int max = nums[0];// 30 assign first number then compare
		for (int i = 0; i< nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
				
			}
		}
		System.out.println("Find a max number: "+max);
		
	}

}




