package day41_CustomClass;
import java.util.*;
public class WarmUp {

	public static void main(String[] args) {
		
		List<Integer>dnum = new ArrayList<>();
			dnum.add(2);
			dnum.add(3);
			dnum.add(4);
		System.out.println(doubleTheList(dnum));
		
	}
	public static List<Integer> doubleTheList(List<Integer>nums){
		
		for (int i = 0; i < nums.size(); i++) {
			nums.set(i, nums.get(i)*2);
		}
		return nums;
	}
	
}
