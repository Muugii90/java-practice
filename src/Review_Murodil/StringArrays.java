package Review_Murodil;

import java.util.Arrays;

public class StringArrays {

	public static void main(String[] args) {
		
		
		String []first = {"cybertek", "java","students","mentor"} ;
		String [] second = {"1 millon", "100K", "16K", "time"};
		System.out.println(Arrays.toString(add2Arrays(first, second)));
		
		System.out.println(Arrays.toString(first));
		System.out.println(Arrays.toString(second));
		
		
	}
	
		public static String [] add2Arrays (String []str1, String []str2){
			
			String [] newOne = new String [str1.length];
			String [] newTwo = new String [str2.length];
			for (int i = 0; i < newOne.length; i++) {
				newOne[i]= str1[i]+" - "+str2[i];
				
			}
			return newOne;
		}

	

}
