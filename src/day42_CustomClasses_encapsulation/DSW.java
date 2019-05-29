package day42_CustomClasses_encapsulation;
import java.util.*;
public class DSW {

	public static void main(String[] args) {
		
		Shoes shoes1 = new Shoes();
		shoes1.setShoesData("ECCO", 6.5);
		System.out.println(shoes1.getSHoesData());
		
		Shoes shoes2 = new Shoes();
		shoes2.setShoesData("COACH", 8.5);
		
		Shoes shoes3 = new Shoes();
		shoes3.setShoesData("HUGO BOSS", 9.5);
		
		Shoes [] shoesArray = new Shoes[3];
		shoesArray[0] = shoes1;
		shoesArray[1] = shoes2;
		shoesArray[2] = shoes3;
		
		System.out.println(shoesArray[0].getSHoesData());
		System.out.println(shoesArray[1].getSHoesData());
		System.out.println(shoesArray[2].getSHoesData());
		
		ArrayList<Shoes>myShoes = new ArrayList<>();
		
		myShoes.add(shoes1);
		myShoes.add(shoes2);
		myShoes.add(shoes3);
		
		System.out.println(shoesArray[0].brand);
		System.out.println(shoesArray[1].brand);
		System.out.println(shoesArray[2].brand);
		
		System.out.println(myShoes.get(0).getSHoesData());
		System.out.println(myShoes.get(1).getSHoesData());
		System.out.println(myShoes.get(2).getSHoesData());
		System.out.println("Only getting size info");
		System.out.println(myShoes.get(0).size);
		System.out.println(myShoes.get(1).size);
		System.out.println(myShoes.get(2).size);
		
		
		Shoes redShoes = myShoes.get(1);
		System.out.println(redShoes.getSHoesData());
		
		
		System.out.println("####For each loop ####");
		for(Shoes shoes :myShoes) {
			System.out.println(shoes.getSHoesData());
		}
		
		System.out.println("#### For Loop #####");
		for (int i = 0; i < myShoes.size(); i++) {
			if(myShoes.get(i).size > 7) {
				System.out.println(myShoes.get(i).getSHoesData());
			}
			
		
		}

		
	
	}

}
