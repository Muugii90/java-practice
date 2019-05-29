package day40_customClass_;

public class BestBuy {

	public static void main(String[] args) {
		CellPhone cell1 = new CellPhone();
		
		cell1.brand = "Nokia 3310";
		cell1.sreenSize = 2.0;
		cell1.color = "Silver";
		cell1.price = 55.60;
		System.out.println("Brand: "+cell1.brand);
		System.out.println("Sreen Size: "+cell1.sreenSize);
		System.out.println("Color: "+cell1.color);
		System.out.println("Price: "+cell1.price);
		cell1.color = "Black";
		System.out.println("Color: "+cell1.color);
		
		
		CellPhone cell2 = new CellPhone();
		cell2.brand = "IPhone";
		cell2.sreenSize = 7.0;
		cell2.color ="Gold";
		cell2.price = 799.0;
		System.out.println("#### APPLE #####");
	
		System.out.println("Brand: "+cell2.brand);
		System.out.println("Sreen Size: "+cell2.sreenSize);
		System.out.println("Color: "+cell2.color);
		System.out.println("Price: "+cell2.price);
		cell2.color = "Black";
		System.out.println("Color: "+cell2.color);
		System.out.println("##### CALLING METHOD ####");
		
		
		cell1.call();
		cell1.message();
		cell1.takeAPhoto();
		System.out.println("### CELL2 ###");
		cell2.call();
		cell2.message();
		cell2.takeAPhoto();
	}

}
