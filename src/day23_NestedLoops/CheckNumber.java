package day23_NestedLoops;

public class CheckNumber {

	public static void main(String[] args) {
		
		
		
		for (int i =1; i<=100; i++) {
			if(i>=15) {
				break;
			}
			System.out.println("Number "+i);
		}
		System.out.println("#############");
		for (int i =1; i<=100; i++) {
			if(i%2>0) {
				continue;
			}
			System.out.println("Number "+i);
		}
		
		System.out.println("#######SkipingNumbers#######");
		for (int i =1; i<=20; i++) {
			if(i>=5 && i<=10) {
				continue;// 
			}
			System.out.println("Number "+i);
		
	}
	}
}
