package day35_Review;

import java.util.Arrays;

public class UniqueArray {

	public static void main(String... args) {
		int[] arr= {1,3,3};
	
		System.out.println(Arrays.toString(findUnique(arr)));
	}
	
	public static int[] findUnique(int []unique) {
		int uniqueCounter =0;
		int count = 0;
		int find = 0;
		
		for (int i = 0; i < unique.length; i++) {
			count=0;
			for (int j = 0; j < unique.length; j++) {
				if(unique[i]==unique[j]) {
					count++;
					
				}
			}
			if(count==1) {
				uniqueCounter++;
			}
		}
		
		int [] newArr = new int [uniqueCounter];
		int idx = 0;
		
		for (int i = 0; i < unique.length; i++) {
			count = 0;
			for (int j = 0; j < unique.length; j++) {
				if(unique[i]== unique[j]) {
					count++;
				}
			}
			if(count== 1) {
				newArr[idx]=unique[i];
				idx++;
			}
		}
		return newArr;
	}
	
}

