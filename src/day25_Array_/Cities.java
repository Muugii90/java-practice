package day25_Array_;

public class Cities {

	public static void main(String[] args) {
		int [] population1 = new int [5];
		population1 [0] = 5000;
		population1 [1] = 10000;
		population1 [2] = 7000;
		population1 [3] = 8907;
		population1 [4] = 4455;
		String [] cities = {"Miami", "London", "Rome", "Mongolia", "Toyko"};
		
		System.out.println("Population of: "+cities[0]+ " is "+ population1[0]);
		System.out.println("Population of: "+cities[1]+ " is "+ population1[1]);
		System.out.println("Population of: "+cities[2]+ " is "+ population1[2]);
		System.out.println("Population of: "+cities[3]+ " is "+ population1[3]);
		System.out.println("Population of: "+cities[4]+ " is "+ population1[4]);
		
		
		
		for(int i=0; i< cities.length; i++) {
			for(int j=0; j<population1.length; j++) {
			System.out.println("Population of "+i+" is "+population1[i]);
		}
	}
	}
}
