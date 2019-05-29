package day41_CustomClass;

public class showPrice {

	public static void main(String[] args) {
		
		BMW bmw = new BMW();
		System.out.println(bmw.make);
		bmw.model = "m3";
		bmw.model = "740i";
		bmw.showPrice();
		System.out.println("Car Price: "+ bmw.price);
		
		BMW bmw2 = new BMW();
		bmw2.model = "X3";
		bmw2.showPrice();
	}

}
