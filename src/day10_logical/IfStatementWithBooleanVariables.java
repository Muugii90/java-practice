package day10_logical;

public class IfStatementWithBooleanVariables {
	public static void main(String[] args) {
		boolean isBreakTime = false;
		if (isBreakTime == true) {
			System.out.println("Take a brake");
		}else {
			System.out.println("Stay ");
			
		}
		// second version 
		if (isBreakTime) {
			System.out.println("Take a brake");
		}else {
			System.out.println("Stay ");
	}
	
		boolean classTime = false;
		if(classTime==false) {
			System.out.println("Stop talking");
			System.out.println("come back on time");
			System.out.println("Pay Attention");
			System.out.println("Code and have fun!");
		}else {
			System.out.println("Take a walk and have some water");
		}
		
		boolean qualified = false;
		if(qualified != true) { // or if(qualified == false)
			System.out.println("Your application was not approved. Thank you!");
			//send a notification message only if NOT qualified 
			//we need to check if qualified 
		}
			
		
}
	}

