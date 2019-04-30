package day27_arrays05;

import java.util.Arrays;

public class CopyOf {

	public static void main(String[] args) {
			
		double []d1 = {1.22, 5.50, 2.4};
		double []d2 = d1;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		
		d1[0] = 1000.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d2[1]= 4000.5;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		double [] d3 = Arrays.copyOf(d2, d2.length) ;
		System.out.println(Arrays.toString(d3));
		//======================================
		d2[0] = 1;
		System.out.println(Arrays.toString(d3)); 
		// independence object here
		//======================================
		
	}

}