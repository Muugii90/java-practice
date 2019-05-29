package day42_CustomClasses_encapsulation;

public class Coffee {

		String name;
		String size;
		double price;
		int calories;
		
		public void getCoffeeInfo() {
			
			String infomation = "Coffee name: "+name.toUpperCase()+ " Size: "+size.toUpperCase()+ " Price: $"+ price+ " CAL: "+ calories;
			System.out.println(infomation);
		}
		
		public void setName(String newName) {
			
			name = newName;
		}
		public void setSize (String newSize) {
			if(newSize.equalsIgnoreCase("TALL")||
			   newSize.equalsIgnoreCase("Grande")||
			   newSize.equalsIgnoreCase("venti")) {
			size = newSize;
		}else {
			System.out.println("ERROR: Invalid Size " + newSize);
			size = "unknown";
		}
		}
			
		public void setPrice(double newPrice) {
			price = newPrice;
		}
		public void setCal (int newCal) {
			calories = newCal;
		}
		
		public void setCoffeeInfo(String newName, String newSize, double newPrice, int newCal ) {
			
			setName(newName);
			setSize(newSize);
			setPrice(newPrice);
			
			
			
			price = newPrice;
			calories = newCal;
				
		}
			
		
}
