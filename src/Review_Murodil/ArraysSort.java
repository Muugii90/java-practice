package Review_Murodil;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		
		int []nums = {4,6,2,8,90,-4};

		Arrays.sort(nums);
			for(int n : nums) {
				System.out.print(n+" ");
				System.out.println();
		
		String [] name = {"aame", "boko", "cijig","dom"};
		Arrays.sort(name);
		for (String m : name) {
			System.out.println(m);
		}
	   
		
		String [] dom = {"moogii","mike","tsoomoo", "haku"};
		Arrays.sort(dom);
		for (String d : dom) {
			System.out.println(d);
			System.out.println();
		}
			char [] charArray = {'c','A','B','G','y'};
			Arrays.sort(charArray,0,4);
			for(char ch : charArray) {
				System.out.println(ch+" ");
			}
 		
	}

}
	}
