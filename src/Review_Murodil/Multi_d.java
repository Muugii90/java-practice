package Review_Murodil;

import java.util.Arrays;

public class Multi_d {

	public static void main(String[] args) {

		double[] price = new double[4];
		price[0] = 200.0;
		price[1] = 95.0;
		price[2] = 29.0;
		price[3] = 250.0;

		Arrays.sort(price);
		for (double d : price) {
			System.out.println(d);

		}
		String[] names = { "Adam", "John", "Don" };// already sorted
		Arrays.sort(names);
		Arrays.binarySearch(names, "Adam");
		System.out.println(Arrays.binarySearch(names, "Don"));

		char[] chArr = { 'A', '*', '%', '#' };
		char[] newArr = Arrays.copyOf(chArr, 4);
		System.out.println(newArr);
		
		//======EQUALS METHOD======
		//1
		int []arr1 = {45,32,54};
		int []arr2 = arr1;
		System.out.println(Arrays.toString(arr2));
		System.out.println(arr1==arr2);
		System.out.println(Arrays.equals(arr1, arr2));
		
		//2
		int  [] arr3 = {45,32,54};
		System.out.println(arr1==arr3);
		System.out.println(Arrays.equals(arr1, arr3));
		
		
		int [][]nums = new int[2][3];
		nums[0][0]= 10;
		nums[0][1]= 20;
		nums[0][2]= 30;
		
		nums[1][0]= 40;
		nums[1][1]= 50;
		nums[1][2]= 60;
		
		int [][] nums2 = {{10,20,30} , {40,50,60}};
		System.out.println(nums[0][1]);
		//System.out.println(nums.length);
		
		String word = "Java";
		System.out.println(word.charAt(3));
		
		
		
		
		
	}	
}