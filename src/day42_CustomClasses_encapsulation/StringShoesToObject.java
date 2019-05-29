package day42_CustomClasses_encapsulation;

import java.util.Scanner;
import java.lang.*;
public class StringShoesToObject {

	public static void main(String[] args) {
		
		Shoes shoes = new Shoes();
		
		String data = "Bruno Magli,9.5";
		
		String[]arrData = data.split(",");
		
		shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
		
		System.out.println(shoes.getSHoesData());
		
		System.out.println("#### without method ####");
		shoes.brand = arrData[0];
		shoes.size = Double.parseDouble(arrData[1]);
		System.out.println(shoes.getSHoesData());
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("What shoes of brand?");
		String brand = scan.next();
		System.out.println("What is your size? ");
		double size = scan.nextDouble();
		
		Shoes shoes1 = new Shoes ();
		shoes1.setShoesData(brand, size);
		System.out.println(shoes1.getSHoesData());
		
		
		
	}
	
}
