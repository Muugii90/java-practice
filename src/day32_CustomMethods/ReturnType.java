package day32_CustomMethods;

public class ReturnType {

	public static void main(String[] args) {
		System.out.print(giveMe10$());
		int i = giveMe10$();
		System.out.print(i);
		System.out.println(giveMeYourName());
	}

	public static int giveMe10$() {
		System.out.println();
		System.out.println("Returning 10 from method ");
		return 10;
		
	}
	
	public static String giveMeYourName() {
		System.out.println();
		String name ="Munkhnasan";
		return name;
	
	}
}
