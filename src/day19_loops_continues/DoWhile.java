package day19_loops_continues;

public class DoWhile {

	public static void main(String[] args) {
		//print 1 to 10 using do while loop
		int i = 1;
		do {
			System.out.println(i);
			i++;
		
			
		}while (i<=10);
		
		int sum = 0;
		int j = 1;
		
		do { 
			sum = sum +j;// sum +=j
			j++;
		}while(j <=5);// check the condition on the bottom
		
			
		System.out.println("Sum from 1 to 5 is "+ sum);
	}

}
