package day42_CustomClasses_encapsulation;

import java.util.Arrays;

public class Burger7 {

	public static void main(String[] args) {
		
		
		Burger burger1 = new Burger();
		burger1.name = "COWBOY";
		String []ings = {"onion ", "american cheese", "lettuce", "pickles","b7 sause"};
		burger1.ingredients = ings;
		
		System.out.println(burger1.name);
		System.out.println(Arrays.toString(burger1.ingredients));
		System.out.println(burger1.ingredients[0]);
		
		for(String show : ings) {
			System.out.print(show+" ");
		}
		
		
		for (int i = 0; i < burger1.ingredients.length; i++) {
			System.out.println(burger1.ingredients[i]);
		}
	}

}
