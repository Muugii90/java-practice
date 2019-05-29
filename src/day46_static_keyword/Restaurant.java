package day46_static_keyword;

public class Restaurant {

	public static void main(String[] args) {
		
		Dinner Mom = new Dinner();
		Dinner Dad = new Dinner();
		Dinner Me = new Dinner();	

		System.out.println("Total slices: "+Dinner.pizzaSlices);
		Dad.takeASlice();
		Mom.takeASlice();
		Me.takeASlice();
		System.out.println("Total slices: "+Dinner.pizzaSlices);
		
		System.out.println("Total slices: "+Dad.pizzaSlices);
		Me.takeASlice(3);
		Dad.takeASlice(2);
		Mom.takeASlice();
		Me.takeASlice();
		System.out.println("Total slices: "+Dinner.pizzaSlices);
		System.out.println("Total slices: "+Mom.pizzaSlices);
		
	}
}
