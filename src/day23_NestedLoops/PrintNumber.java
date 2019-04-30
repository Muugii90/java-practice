package day23_NestedLoops;

//import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		//Scanner scan = new Scanner (System.in);
		//int number = scan.nextInt();
		
		for(int i = 1; i<=50; i++) {
			
			if((i%5==0) && (i%20 !=0) ){
				continue; 
			}
			if(i%20==0) {
				break; 
			
			}
			System.out.print(i+", ");
		}
		
	}

}
