package day20_forLoops;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		for (int i = 1; i <=100; i++) {
			if (i%2==0)
			System.out.print(i+ " ");
		}
		System.out.println();
		for (int i = 1; i <= 100; i++ ) {
			if(i%2!=0)
				System.out.print(i+ " ");
		}
		int sumOfEven = 0;
		int sumOfOdds = 0;
		
		
		for (int num = 1; num<= 100; num++) {
			if (num % 2==0) {
				sumOfEven += num;
			}else {
				sumOfOdds += num;
			}
		}
			System.out.println();
			System.out.print("Sum of evens: "+sumOfEven);
			System.out.println();
			System.out.print("Sum of odds: "+sumOfOdds);
		
	} 

}
