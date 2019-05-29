package day43_encapsulation_constructor;

import java.util.ArrayList;

public class DSW {

	

	public static void main(String[] args) {
		
	
		Shoes shoe = new Shoes("Boots", "Ecco", 120);
		shoe.setType("Boots");
		shoe.setMade("Ecco");
		shoe.setPrice(120);
		System.out.println(shoe.toString());
		ArrayList<Shoes>list = new ArrayList<>();
		list.add(new Shoes ("Sandal", "Coach", 99));
		list.add(new Shoes ("Heels", "MK", 130));
		list.add(new Shoes ("Rain boots", "Burberry", 250));
		
		
		
		System.out.println(shoe.getType());
		System.out.println(shoe.getMade());	
		System.out.println(shoe.getPrice());
	
		
		int idx =-1;
		int max =0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getPrice()>max) {
				max = list.get(i).getPrice();
				idx =i;
			}
		}
		
		System.out.println(list.get(idx));
	}
	}


