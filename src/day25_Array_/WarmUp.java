package day25_Array_;

public class WarmUp {

	public static void main(String[] args) {
		int []number = {8,9,5,12,44,56,78,90};
		int numbers[] = new int [5]  ;
		numbers [0] = 90;
		numbers [1] = 100;
		numbers [2] = 30;
		numbers [3] = 20;
		numbers [4] = 12;
		numbers [0] =99;
	System.out.println(numbers[0]);
	System.out.println(number.length);
	System.out.println();
	
	
	numbers [1] = numbers [1]+10;
	numbers [2]++;
	numbers [3] = numbers [0];
	numbers [4] =numbers [3]+ numbers [2]+numbers [1];
	
	
	}

}
