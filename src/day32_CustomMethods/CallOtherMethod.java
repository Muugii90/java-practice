package day32_CustomMethods;

public class CallOtherMethod {

	public static void main(String[] args) {
		
		//makePancake();
		//makePaste();
		cook("Omelette", "Eggs, Salt, Green Peppers, Onions");
	}
	public static void cook (String dish, String ingredients) {
		System.out.println("~~ "+ dish.toUpperCase()+ " RECIPE ~~");
		add(ingredients);
		System.out.println("Cook it util it is cooked");
		System.out.println("~~ "+  dish.toUpperCase()+ " IS READY ");
	}
	public static void makePaste() {
		System.out.println();
		System.out.println("Italian pasta");
		add("water, salt, olive oil");
		boil(2);
		add("Paste");
		boil(10);
		mix(60);
		add("parmesan cheese, ");
	}
	
	public static void makePancake() {
		System.out.println("Pancake Receipe");
		add("Milk, eggs, flour, suger");
		mix(120);
		fry(3);
		System.out.println("Enjoy it. ");
	}
	public static void add(String cook){
		
		System.out.println("Add "+ cook);
	}
	public static void mix(int mix) {
		System.out.println("Mix for "+mix+ " second");
	}
	public static void fry (int minutes) {
		System.out.println("Fry for "+ minutes +" minutes");
	}
	public static void boil (int min) {
		System.out.println("Boil it for "+ min+ " minutes");
	} 
	
}
