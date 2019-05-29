package day46_static_keyword;

public class Vehicle {

		String type; //
		static int numberOfVehocle; // shared, one central valie
		
		public static void vehicelInfo() {
			//System.out.println("Type: "+ type); will not compile. type 
			System.out.println("Number of Vehicles: "+numberOfVehocle);
			int count = getNumberOfVehicles();
			String make = "Kia";
			make = make.toUpperCase();
			System.out.println("Make: "+make);
			
		}
		public static int getNumberOfVehicles() {
			return numberOfVehocle;
		}
		
		public String toString() {
			return "Vehicle type: "+type + " | count: "+ numberOfVehocle;
		}
}
