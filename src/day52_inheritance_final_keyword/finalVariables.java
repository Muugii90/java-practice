package day52_inheritance_final_keyword;

public class finalVariables {
	
	public final int ROSTER_MAX_RANGE = 610;// 
	public final int MODEL_3_SPEED;
	public final int MODEL_X_PASSEANGERS;
	public final String JAN = "January";
	
	public static final String COMPANY_NAME = "Cybertek";
	public static final String USER_ADMIN_USER_NAME;
	
	static {
		USER_ADMIN_USER_NAME ="admin@gmail.com";
	}
	public finalVariables() {
		MODEL_3_SPEED =180;
	}
	
	{
		MODEL_X_PASSEANGERS = 7;
	}
	public static void main(String[] args) {
		
		final int MAX_PASSENGERS_COUNT = 5;
		
		//MAX_PASSENGERS_COUNT = 10;
		
		final int SSN; 
		//code here 
		SSN = 123456789;
		
	finalVariables finalvars = new finalVariables();
	
	System.out.println("Max passnager: "+MAX_PASSENGERS_COUNT);
	System.out.println("Model 3 max speed: "+finalvars.MODEL_3_SPEED);
	System.out.println("Model X Passengers: "+ finalvars.MODEL_X_PASSEANGERS);
	System.out.println(Integer.MAX_VALUE);
	
	System.out.println(COMPANY_NAME);
	System.out.println(USER_ADMIN_USER_NAME);
	
	System.out.println(finalVariables.COMPANY_NAME);
	System.out.println(finalVariables.USER_ADMIN_USER_NAME);
	
	
	
	
	}

}
