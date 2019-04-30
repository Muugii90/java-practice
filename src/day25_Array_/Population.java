package day25_Array_;

//import java.util.Scanner;

public class Population {

	public static void main(String[] args) {
		String [] population = {"Mongolia", "Russia", "USA", "Paris", "Korea"};
		//Scanner scan = new Scanner (System.in);
		
		// 	int [] population1 = {5000, 10000, 7000, 8907,4455}; // same as 
		int [] population1 = new int [5];
		population1 [0] = 5000;
		population1 [1] = 10000;
		population1 [2] = 7000;
		population1 [3] = 8907;
		population1 [4] = 4455;
		System.out.println(population1[0]);
		System.out.println("City 1 population: "+ population1 [0]);
		System.out.println("City 2 population: "+ population1 [1]);
		System.out.println("City 3 population: "+ population1 [2]);
		System.out.println("City 4 population: "+ population1 [3]);
		System.out.println("City 5 population: "+ population1 [4]);
		System.out.println();
		for(int i=0; i<population1.length; i++) {
			System.out.println("City "+i+" population : "+population1[i]);
		}
		System.out.println();
		int i=0;
        for(int num: population1) {
            System.out.println("City "+ i++ +" population: "+num);
		System.out.println();
        }
          int idx = 0;
          System.out.println("City 1 population: "+ population1 [idx]);
          
          idx++;
          System.out.println("City 2 population: "+ population1 [idx]);
          
          String str = "abc";
         
          System.out.println("City STR population: "+ population1 [str.length()]);
          // finding a same length of my String str length 
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
  }
}
