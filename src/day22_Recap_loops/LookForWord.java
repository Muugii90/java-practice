package day22_Recap_loops;

import java.util.Scanner;

public class LookForWord {

	public static void main(String[] args) {
		String sentence = "He said hi, then she replied hi. hi guys!";
		int count =0;
		for (int i = 0 ; i<sentence.length()-1; i++) {
			String temp = sentence.substring(i,i+2);
			
			if(temp.equals("hi")) {
				count++;
			}	
			}
			System.out.println("Count "+count);
			//System.out.println(temp);
		
			 Scanner scan = new Scanner(System.in);
			    String word = scan.nextLine();
			    int count1 =1;
			    for(int i= 0; i< word.length()-1; i++) {
			    	String tem = word.substring(i, i+1);
			    	if(word.equals("java")) {
			    		System.out.println("true");
			    	}else {
			    		System.out.println("false");
			    	}
			    }
			  
			
	}

}
