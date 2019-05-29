package day53_Inheritance06;

public class TestHiding {

	public static void main(String[] args) {
		
		City city = new City(345, "London");
		Capital capital = new Capital (433, "Paris", 1234567L);
		System.out.println(city.count);
		System.out.println(capital.count);
		
		System.out.println(city.toString());
		System.out.println(capital.toString());
		
		
		city.buildARaod();
		capital.buildARaod();
		
		City.buildARaod();
		Capital.buildARaod();
		
		City city1 = new City(546, "Mongolia");
		Capital cap1 = new Capital (9876, "Fairfax", 123456L);
		city1.letsBuildARoad();
		cap1.letsBuildARoad();
	}

}
