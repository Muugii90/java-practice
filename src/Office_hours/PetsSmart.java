package Office_hours;

public class PetsSmart {
	public static void main(String[] args) {
		Cat cat = new Cat() ;
		cat.name = "Bars";
		cat.color = "Black";
		cat.breed = "Persian cat";
		
		sellCat(cat);
		}
	public static void sellCat(Cat cat) {
			System.out.println("Selling "+ cat.breed);
			System.out.println("it name is "+ cat.name);
				
	}
	
	public static void sellCatOnline(Cat cat) {
		System.out.println("Selling "+ cat.breed);
		System.out.println("it name is "+ cat.name);
		
			
	}
}
