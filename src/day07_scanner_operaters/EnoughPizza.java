package day07_scanner_operaters;

public class EnoughPizza {

	public static void main(String[] args) {
		//slices in pizza -> 8
		//slices per students -> 2
		
		int pizzaCount = 32;
		int studentsCount = 145;
		 boolean isEnoughPizza = pizzaCount * 8 >= studentsCount * 2;
		 
		 //isEnoughPizza = pizzaCount 8 / studentsCount> = 2;
		 System.out.println("Is enough pizza for us: " +isEnoughPizza);
	
		 
		 
		
	}

}
