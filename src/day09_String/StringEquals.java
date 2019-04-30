package day09_String;

public class StringEquals {

	public static void main (String [] args) {
		String str1 ="java";
		String str2 = "java";
		
		System.out.println(str1==str2);
		System.out.println(str1=="java");
		System.out.println(str2=="Java");
		
		//equals method. ====preferred way======
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equals ("java"));
		System.out.println(str2.equals("Java"));
		
		/* String today = "Tuesday";
		 * 
		 * */
		
		//String month = "March";
		String month = new String ("March");
		String month2 = new String ("March");
		
		System.out.println(month == month2);
		
		// in the above lines, Java is not doing values comparison. 
		// Its is just checking  if month and month2 are pointing to same 
		
	  System.out.println(month.equals(month2)); // use this way
	  System.out.println(month.equals("March")); // or this way
	  
	  // in this above examples, by using equals method, java is checking if value are same. 
	  //which is proper way to comparing strings.
	  
	  
	}
}
