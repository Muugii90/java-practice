package day36_WrapperClasses_ArraysListIntro;
import java.util.*;
public class IntoArrayList {

	public static void main(String[] args) {
		String []str = new String [5];
		
		//Creat an ArrayList
		ArrayList<String> names = new ArrayList<>();
		ArrayList<Integer> nums = new ArrayList <>();
		
		names.add("Munkhnasan");
		names.add("Mike");
		nums.add(28);
		nums.add(32);
		nums.add(99);
		nums.add(100);
		System.out.println("First name: "+names +" Age: "+nums);
		
		System.out.println(names.get(0)+" "+ nums.get(0));
		System.out.println(names.get(1)+" "+ nums.get(1));
		
		System.out.println(names.size());
		System.out.println(nums.size());
		
		
	}

}
