package Review_Murodil;

import java.util.Arrays;

public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = {"java", "python","c++"};
		
		for (int i = 0; i < names.length; i++) {
			String temp = names[i];
			System.out.println(temp);
		}
		int [] nums = {2,78,6,45};
		//String n = Arrays.toString(nums);
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		
		//BINARY METHOD
		
		String[]words = {"pizza", "wooden spoon","cake", "tomota" };
		Arrays.sort(words);
		System.out.println(Arrays.toString(words));
		System.out.print(Arrays.binarySearch(words,"wooden spoon"));
		
		int idx = -1;
		for (int i = 0; i < words.length; i++) {
			if(words[i].equals("cake")) {
				idx = i;
				break;
				
			}
		}
		System.out.println(idx);
		if(idx == -1) {
			System.out.println("not found");
		}
		int a = 10;
		int b = 20;
		a = a + b;//30
		b = a - b;//10
		a = a - b;//20
		System.out.println("a "+ a);
		System.out.println("b "+ b);
		
		int []num = {10,30,40};
		int []num1 = Arrays.copyOf(num, 4);
		System.out.println(Arrays.toString(num1));
		 num1[3] = 100;
		 System.out.println(Arrays.toString(num1));
		
		 
		 int []ab = {1,2,3,4,7};
		 int []abc ={1,2,3,2,7};	
		 int []d = {3,4,6,2,5};
		 Arrays.sort(d);
		 
		 
		 if (Arrays.equals(ab, abc)){
			 System.out.println("They have same numbers");
		 }else {
			 System.out.println("Numbers did not much");
		 }
	
	}
	

}
