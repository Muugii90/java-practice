package day24_Array;

public class CheckFirstAndLastValue {

	public static void main(String[] args) {
		
		int []numbers = {12,41,213,21,42,12};
		
			boolean equals = numbers[0]== numbers[numbers.length-1];
			System.out.println(equals);
			
			//same result as above
			System.out.println(numbers[0]== numbers[numbers.length-1]);
			
			
			//same result
			if(numbers[0]== numbers[numbers.length-1]) {
				System.out.println(true);
			}else{
				System.out.println(false);
				
				
				
			
			}
		}
	

	}


