package day36_WrapperClasses_ArraysListIntro;

public class Boxing {

	public static void main(String[] args) {
		//AUTO-BOXING VS UNBOXING
		//AUTO_BOXING is converting from
		//Primitive ==> primitive -> object 
		//==============================
		//UnBOXING
		// -> convert object into primitive
		// -> convert wrapper class object into primitive
		
		//UnBoxing
		Double d1 = new Double (34.2);
		double d2 = d1;
		System.out.println("d1: "+ d1);
		System.out.println("d2: "+ d2);
		// Auto-boxing ==> putting into the box
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;
		
		long l1 =  new Long(600000);//
		long l2 = new Long(2345435L);
		long l3 = l2;// unboxing
		Long l4 = l3;//auto-boxing
		
		
		Integer num3 = Integer.valueOf(345);
		//Double d3 = num3; casting not possible with wrapper classes
		
		
		
		
		
	}

}
