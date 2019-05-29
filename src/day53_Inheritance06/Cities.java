package day53_Inheritance06;

public class Cities {

	public static void main(String[] args) {
		City mongol = new City(12345, "Mongolia");
		System.out.println(mongol.toString());
		
		City istanbul = new City(4444, "Istanbul");
		City anotherCity = new City(4444, "Istanbul");
		
		
		if(istanbul.equals(anotherCity)) {
			System.out.println("Both are Istanbul");
		}else {
			System.out.println("Does not equal");
		}
		
		
		System.out.println(mongol.hashCode());
		System.out.println(istanbul.hashCode());
		System.out.println(anotherCity.hashCode());
		
		
		Capital cap = new Capital(101, "Washington DC", 800_000L);
		System.out.println(cap.toString());
		
		cap.displayCount();
		
	}

}
