package day37_ArrayList;
import java.util.*;
public class MyCities {

	public static void main(String[] args) {
		List<String> cities = new ArrayList<>();
		cities.add("Arlington");
		cities.add("Baku");
		cities.add("Sterling");
		cities.add("Tashkent");
		cities.add("Mclean");

		for(String c : cities) {
			System.out.print(c+" ");
		}
		System.out.println();
		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i)+" ");
		}
		System.out.println();
		cities.remove("Baku");
		System.out.println(cities.toString());
		System.out.println("Is list empty: "+cities.isEmpty());
		
		cities.add(0, "Darhan");
		System.out.println(cities);
		cities.add(3, "Ulaanbaatar");
		System.out.println(cities);
		
		cities.set(2, "McLean");
		System.out.println(cities);
		
		int idx = cities.indexOf("Ulaanbaatar");
		System.out.println("Ulaabatar index "+idx);
		
		cities.set(idx, "WashigtonDC");
		System.out.println(cities);
		
		
		
		cities.set(cities.indexOf("McLean"), "Fairfax");
		System.out.println(cities);
		
		
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println("Clear the list: "+empty);
		
		
		
		
		
		
	}

}
