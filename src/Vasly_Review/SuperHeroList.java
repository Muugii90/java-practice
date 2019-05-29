package Vasly_Review;

import java.util.ArrayList;
import java.util.Arrays;

public class SuperHeroList {

	public static void main(String[] args) {
//		SuperHero object = new SuperHero();
//		ArrayList<String> list = new ArrayList<>();
//		list.addAll(Arrays.asList(object.superheroes));
//		System.out.println(object);
		//list.addAll(Arrays.asList("Spider man", "Iron man", "Hulk", "Wonder Woman", "Thor", "Batman", "Hellboy", 
		//"Super Man", "Flash", "Captain America", "Ant-Man", "Aquaman"));
		
		ArrayList<String> superheroes = new ArrayList<>();
		//superheroes.add("Spiderman");
		//superheroes.set(0, "Iron man");
		//System.out.println(superheroes.get(0));
		
		superheroes.add("Iron man");
		superheroes.add("Hulk");
		superheroes.add("Wonder Woman");
		superheroes.add("Thor");
		superheroes.add("Batman");
		superheroes.add("Hellboy");
		superheroes.add("Superman");
		superheroes.add("Flash");
		superheroes.add("Captain America");
		superheroes.add("Ant-Man");
		superheroes.add("Aquaman");
		String longestname = "";
		System.out.println(superheroes);
		ArrayList<String> superheroesWithSpace = new ArrayList<>();
		for(String hero : superheroes) {
			if(hero.contains(" ")) {
				superheroesWithSpace.add(hero);
			}
			
			if(hero.length() >longestname.length()) {
				longestname = hero;
			}
			}
		System.out.println("With space hero names: "+superheroesWithSpace);
		System.out.println("The longest name: "+ longestname);
		
		//how to find second longest name?
		String secondLongest ="";
		for(String hero : superheroes) {
			if(!hero.equals(longestname)) {
		if(hero.length() > secondLongest.length()) {
			secondLongest = hero;
		}
		}
	}
		System.out.println("Second longest name: "+secondLongest);
}
}