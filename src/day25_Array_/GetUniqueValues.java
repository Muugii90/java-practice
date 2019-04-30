package day25_Array_;

import java.util.Arrays;

public class GetUniqueValues {

	public static void main(String[] args) {
		int [] nums = new int[]{12,34,56,7,8,8,654,23,23};
		
		
		for (int i = 0; i < nums.length; i++) {
			int currentNum = nums[i];
			boolean duplicate = false;	
			
		for (int j = 0; j < nums.length; j++) {
			if(nums[j]== currentNum && i !=j)	{
				duplicate = true;
				break;
	
		}
	}
		if(duplicate == false) {
			System.out.println(currentNum);
	
	}
		}
		String []arr = new String[]{"apples", "kiwi", "eggs"};
		for (int moogii = 0; moogii < arr.length; moogii++) {
			System.out.println(arr[moogii].substring(0,3));
		}
		String [] word = new String[] {"eggs", "ema", "moogii",};
		int count = 0;
		for(String str : word) {
			if(str.contains("e")) {
				count++;
			}
		}
	
		String[] fewValue = new String[count];
		int i = 0;
		for (String each : arr) {
			if(each.contains("e")) {
				fewValue[i]= each;
				i++;
			}
		}
		for(String val : fewValue)
		System.out.println(val);
	}

	}
