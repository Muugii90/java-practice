package day42_CustomClasses_encapsulation;



public class CallingCoffee {

	public static void main(String[] args) {
		
		Coffee cafe = new Coffee();
		cafe.name = "Grande Latte";
		cafe.size = "Grande";
		cafe.price = 3.95;
		cafe.calories = 450;
		
		cafe.getCoffeeInfo();
		
		Coffee coffee2 = new Coffee();
		coffee2.setName("Java Chip");
		coffee2.size = "VENTI";
		coffee2.price = 5.95;
		coffee2.calories = 600;
		
		coffee2.getCoffeeInfo();
		
		//calling the only the method
		Coffee coffee3 = new Coffee();
		coffee3.setName("Grande Latte");
		coffee3.setPrice(5.45);
		coffee3.setSize("Tall");
		coffee3.setCal(400);
	
		coffee3.getCoffeeInfo();
		
		Coffee coffee4 = new Coffee();
		coffee4.setCoffeeInfo("FLAT WHITE", "TALL", 3.95, 170);
		coffee4.getCoffeeInfo();
		
		
	}

}
