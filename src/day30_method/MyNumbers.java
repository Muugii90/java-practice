package day30_method;
import java.util.*;
public class MyNumbers {
public static void main(String[] args) {
	showMe5Numbers();
	doPush10Up(); 
}
	public static void showMe5Numbers() {
	
		Random rand = new Random();
		for(int i = 1; i <=5; i++) {
			System.out.print(rand.nextInt(1001)+" ");
		}
		System.out.println();
	}
		public static void doPush10Up() {
			for (int j =1 ; j <=10; j++) {
				System.out.println("Pushup - "+j);
			}
			System.out.println("Time to rest");
		}
	}
	

