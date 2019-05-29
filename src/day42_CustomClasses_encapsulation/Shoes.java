package day42_CustomClasses_encapsulation;

public class Shoes {

		String brand;
		double size;
	
		
		public void setShoesData(String newBrand, double newSize) {
		brand = newBrand;
		size = newSize;
		
	}
		public String getSHoesData() {
			return brand +" | "+ size;
	}
}
