package Vasly_Review;

import java.util.Arrays;

public class SuperHero {
	String[] superheroes = { "Spider man", "Iron man", "Hulk", 
			"Wonder Woman", "Thor", "Batman", "Hellboy",
			"Super Man", "Flash", "Captain America", "Ant-Man", "Aquaman" };

	public static void main(String[] args) {
		
		String [] arr1 = {"word"};
		String arr2 [] = new String[2];
		String [] arr3 = new String[] {"apple", "orange", "kiwi"};
		arr2[0] = "word two";
		arr2[1] = "one more word";
		arr2[1] = "some more word";
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		String[] superheroes = { "Spider man", "Iron man", "Hulk", 
				"Wonder Woman", "Thor", "Batman", "Hellboy",
				"Super Man", "Flash", "Captain America", "Ant-Man", "Aquaman" };
		
		String heros = "";
		int count =0;
		for(String name : superheroes) {
			if(name.contains(" ")) {
				heros += name+", ";
				System.out.println(name);
				count ++;
			}	
		}
		System.out.println("Count of superheroes with space "+count);
		System.out.println(heros.substring(0, heros.length()-2));
		
		String [] newHerous = heros.split(", ");
        System.out.println(Arrays.toString(newHerous));
        
        String [] newHerous2 = new String [count];
        for(int i=0,j=0; i<count; i++) {
            if(superheroes[i].contains(" ")) {
                newHerous2[j]= superheroes[i];
                j++;
            }
            System.out.println("int i: "+i+ "int j: "+ j);
        }
        System.out.println(Arrays.toString(newHerous2));
        
		
		
		
	}

}
