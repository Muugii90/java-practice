package day08_casting_conditionals;

public class RelationalOperators {

	public static void main(String[] args) {
		
		double d1 = 23.56;
		double d2 = 20.43;
		System.out.println(d1 >= d2);
		boolean check= d1>= d2;
		
		System.out.println("Check: " + check);
		
		char ch1 = 'a';
		char ch2 = 'j';
		char ch3 = 'A';
		System.out.println(ch2 > ch1); //true 'j'> 'a'
		System.out.println(ch1 >ch3); // true 'a' > 'A'
		
		boolean a = true == false;
		System.out.println(a);
		
		boolean b = true != false;
		System.out.println(b);
		
		/* 1. =====if else =======
		 if (condition =){
		 		// some code to run /////// if this condition is true it will work. 
		 }else}
		 	//some other code to run////////if code you run up there was not true this code will run
		 	 * 
		2. ==========if by itself========
		if (condition ) 
				//some code to run
		3. =======if else without curly braces {}========
		
		 
		 */
		
	}

}
