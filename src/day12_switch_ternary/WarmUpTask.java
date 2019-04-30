package day12_switch_ternary;
import java.util.*;
public class WarmUpTask {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		//int n1, n2, n3 ;
		  //  int n1 = scan.nextInt();
		  //  int n2 = scan.nextInt();
		 //   int n3 = scan.nextInt();
		
		   /* if (n1 > n2 && n1 >n3){
			    System.out.println ("n1 is bigger");
			  }else if (n2 > n1 && n2 > n3){
			    System.out.println ("n2 is bigger");
			  }else if (n3 > n2 && n3 > n1){
			    System.out.println ("n3 is bigger");// version 1
			  }*/
			int n1 = 1000;
			int n2 = 1;
			int n3 = 100;
			
			if(n1 > n2 && n1 > n3) {
				System.out.println("n1 is bigger");
			}else if(n2 > n3 ) {
				System.out.println("n2 is bigger");
			}else {
				System.out.println("n3 is bigger"); // version 2
			}
			
	}

}
