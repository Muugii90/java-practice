package day39_ArrayList4;

import java.util.ArrayList;
import java.util.Comparator;

public class Cities {

	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();

		cities.add("Tokyo");
		cities.add("New York");
		cities.add(0, "Paris");
		cities.add("Pittsburgh");
		cities.add(1, "Berlin");
		cities.add("Madrid");
		cities.add("Moscow");
		cities.add("Istanbul");
		cities.add("Washington D.C.");
		cities.add("Amsterdam");
		cities.add("Zurich");
		cities.add("Singapore");
		cities.add("Milan");
		cities.add("Toronto");
		cities.add("London");
		cities.add("Mila");

		for (String city : cities) {
			System.out.print(city + " | ");
		}
		System.out.println();
		
		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + " | ");
		}
		System.out.println();
		System.out.print(cities.toString().toUpperCase());
		System.out.println();
		
		for (int i = 0; i < cities.size(); i++) {
			
			System.out.print(cities.get(i).toUpperCase() + " | ");
		}
		System.out.println();
		String paris = cities.get(0).toUpperCase();
		cities.set(0, paris);
		System.out.println(cities.get(0));

		System.out.println();
		System.out.println(cities.set(1, cities.get(1).toUpperCase()));
		System.out.println();
		// Finding longest and shortest cities.

		String longestCity = " ", shortestCity = "";

		for (String city : cities) {
			if (city.length() > longestCity.length()) {
				longestCity = city;
			}
		}

		shortestCity = cities.get(0);
		for (String city : cities) {
			if (city.length() < shortestCity.length()) {
				shortestCity = city;
			}
		}

		System.out.println("LongCity : " + longestCity);
		System.out.println("ShortCity: " + shortestCity);

		ArrayList<String> citiesMoreThan6 = new ArrayList<>();
		// assign all cities that has more 6 characters to list this Arraylist

		for (String city : cities) {
			if (city.length() > 6) {
				citiesMoreThan6.add(city);
			}
		}
		System.out.println(citiesMoreThan6);
		
		
		
	}

}
