package day18_while_dowhile_loop;

public class Number100to0 {

	public static void main(String[] args) throws InterruptedException {
		int number = 1;
		 
		 while (number <= 10) {
			 System.out.print(number+ ", ");// osgoj bna
			 number++;
			 Thread.sleep(100);//pause the code execution for a second
		 }
		 System.out.println("\nValue of the number: "+number);
		
		 
		 
		 int num2 = 11;
		 while (num2 >= 1) {
			 System.out.print(num2+", ");// hasagdaj bna
			 num2--;
			 Thread.sleep(500);
		 }
		 System.out.println("\nNum2: "+num2);
	}

}
