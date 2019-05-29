package Office_hours;

public class CreateCars {

		public static void main(String[] args) {
			
			Car delorean = new Car("GM", "De Lorean", "20000");
			System.out.println(delorean.getMake());
			System.out.println(delorean.getModel());
			System.out.println(delorean.getPrice());
			
			delorean.setPrice("19000");
			System.out.println(delorean.getPrice());
			
			
			Car camry = new Car("Toyota", "camry", "23000");
			System.out.println();
			camry.setPrice("18000");
			System.out.println(camry.getPrice());
		}
}
